import React, { useState, useEffect } from 'react';
import { View, FlatList, Image, Text, TouchableOpacity } from 'react-native';
import { Feather } from '@expo/vector-icons';
import logoImg from '../../assets/logo.png';
import { useNavigation } from '@react-navigation/native';
import api from '../../services/api'
import styles from './styles';


export default function Animals() {
   /* const [vacas, setVacas] = useState([]);
   const navigation = useNavigation();
  

   function navigateToAddAnimal() {
        navigation.navigate('AddAnimal')
    }
  
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
                <Image source={logoImg} />
               
               <TouchableOpacity style={styles.Button} onPress={navigateToAddProduction}>
                    
                    <Text style={styles.textButton}>Adicionar nova produção</Text>
                    <Feather name="plus-square" size={20} color="#000000" />
                </TouchableOpacity>
            
            </View>
            
            <FlatList
               
                data={vacas}
                style={styles.animalsList}
                keyExtractor={vaca => String(vaca.id)}
                showsVerticalScrollIndicator={false}
                renderItem={({ item: vaca }) => (

                    <View style={styles.vaca}>
                        <Text style={styles.vacaProperty}>Id</Text>
                        <Text style={styles.vacaValue}>{vaca.id}</Text>

                        <Text style={styles.vacaProperty}>Nome</Text>
                        <Text style={styles.vacaValue}>{vaca.nome}</Text>
                        
                        
                        
                        
                        <TouchableOpacity  style={styles.Button} >
                    <Feather name="trash" size={35} color="#000000" onPress={() => deleteAnimal(vaca.id)} />
                </TouchableOpacity>
                    
                    </View>
                    
                )} />


        </View>
    )

}

