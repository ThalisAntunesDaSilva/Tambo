import React, { useState, useEffect } from 'react';
import { View, FlatList, Image, Text, TouchableOpacity, TextInput } from 'react-native';
import { Feather } from '@expo/vector-icons';
import cowImage from '../../assets/cowImage.jpg';
import { useNavigation } from '@react-navigation/native';
/* import api from '../../services/api' */
import styles from './styles';


export default function Animals() {
    
    /*
    const [vacas, setVacas] = useState([]); */
   const navigation = useNavigation();
   
 

   function navigateToAddAnimal() {
        navigation.navigate('AddAnimal')
    }
  /*
    async function loadAnimals() {
        const response = await api.get('/vacas');
       
        setVacas(response.data);
  
    }

   async function deleteAnimal(id) {
       api.request({
             method: 'DELETE', url: `/vacas/vaca`, 
             headers: { 'Content-Type': 'application/json'}, 
             data: {
                id : id
              }, }).then(response => {
                loadAnimals();
            });} 

        

    useEffect(() => { loadAnimals() }, []);

    */
   
return (
<View style={styles.container}>

<View style={styles.header}>
    <Feather name="arrow-left" size={30} color="#000000" onPress={() => {}} />
      <TouchableOpacity style={styles.buttonAdd} onPress={navigateToAddAnimal}>
                <Text style={styles.textButton}>Novo +</Text>
                    </TouchableOpacity>
                        </View>
     <View style={styles.searchBox}>                   
    <TextInput style={styles.inputSearch}>Pesquisa
       <Feather name="search" size={15} color="#000000" onPress={() => {}} />  
                                                                        </TextInput> 
                                                                                </View>
<View style={styles.filterList}>
    <TouchableOpacity style={styles.filterbutton}><Text style={styles.filterTextButton}>Vaca</Text></TouchableOpacity>
    <TouchableOpacity style={styles.filterbutton}><Text style={styles.filterTextButton}>Touro</Text></TouchableOpacity>
    <TouchableOpacity style={styles.filterbutton}><Text style={styles.filterTextButton}>Cria</Text></TouchableOpacity>
    </View>

<FlatList
               data={[1, 2, 3, 4, 5]}
                style={styles.animalsList}
                keyExtractor={ vaca => String (vaca)}
                    showsVerticalScrollIndicator={false}
                    renderItem={() => (
                     
                     <View style={styles.animalBox}>
                        <Image source={cowImage} style={styles.animalImg}></Image>


                  
                        <View style={styles.property}>
                        <Text style={styles.vacaProperty}>ID:</Text>
                        <Text style={styles.vacaProperty}>Nome:</Text>
                        <Text style={styles.vacaProperty}>Tipo:</Text>
                        <Text style={styles.vacaProperty}>Média:</Text>
                        <Text style={styles.vacaProperty}>Estado:</Text>
                        </View>
                        <View style={styles.value}>
                        <Text style={styles.vacaValue}>01</Text>
                        <Text style={styles.vacaValue}>Lucia</Text>
                        <Text style={styles.vacaValue}>Com cria</Text>
                        <Text style={styles.vacaValue}>Vaca</Text>
                        <Text style={styles.vacaValue}>222 L/Mês</Text>
                        </View>
                        
                        <TouchableOpacity  style={styles.Button} >
                            <Feather name="trash"  style={styles.deleteButton} size={25} color="#000000" onPress={() => deleteAnimal(vaca.id)} />
                                </TouchableOpacity>  
                                    </View>
                                            )} />



       
       
        </View>
    )

}

