import React, {useState } from 'react';
import { View, Image, Text, TouchableOpacity, TextInput } from 'react-native';
import styles from './styles';
import { Feather } from '@expo/vector-icons'
import logoImg from '../../assets/logo.png';
import api from '../../services/api';
import { Picker } from '@react-native-community/picker'



export default function AddAnimal(){
  const [value, onChangeText] = useState('Useless Placeholder');
 
  async function postAnimal() {
    api.request({
        method: 'POST', url: `/vacas/vaca`, 
        headers: { 'Content-Type': 'application/json'}, 
        data: {
           
           nome: value
         }, }).then(response => {
         
         })
         
       
   }



return(
<View style={styles.container}>
<View style={styles.header}>
  <Image source={logoImg} />
  <Text style={styles.headerText}>Adicione um animal</Text>
    </View>



<Picker>
  
</Picker>



<View style={styles.addAnimalBox}>
  

    
    
    <Text style={styles.titleName}>Nome do animal</Text>
    <TextInput 
                    style={styles.input}
                    
                    placeholderTextColor='#999'
                    autoCapitalize="words"
                    autoCorrect={false}
                    onChangeText={text => onChangeText(text)}
                />
  
   <Text style={styles.titleName}>Idade</Text>
    <TextInput 
                    style={styles.input}
                    
                    placeholderTextColor='#999'
                    autoCapitalize="words"
                    autoCorrect={false}
                    onChangeText={text => onChangeText(text)}
                />

<Text style={styles.titleName}>Tipo</Text>
    <TextInput 
                    style={styles.input}
                    
                    placeholderTextColor='#999'
                    autoCapitalize="words"
                    autoCorrect={false}
                    onChangeText={text => onChangeText(text)}
                />

<Text style={styles.titleName}>Estado atual</Text>
    <TextInput 
                    style={styles.input}
                    
                    placeholderTextColor='#999'
                    autoCapitalize="words"
                    autoCorrect={false}
                    onChangeText={text => onChangeText(text)}
                />               
    
   
    <TouchableOpacity style={styles.buttonAdd} onPress={postAnimal}>
    <Text style={styles.textAdd}>Adicionar</Text>
<Feather name="plus" size={35} color="#ffffff" />

</TouchableOpacity>


</View>
    
</View>
    
);


    
}
