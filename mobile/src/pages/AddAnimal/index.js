import React, {useState } from 'react';
import { View, Image, Text, TouchableOpacity, TextInput ,Picker } from 'react-native';
import styles from './styles';
import { Feather } from '@expo/vector-icons'
import logoImg from '../../assets/logo.png';
import api from '../../services/api';


export default function AddAnimal(){
  const [value, onChangeText] = useState('Useless Placeholder');
  const [selectedValue, setSelectedValue] = useState("java");
 
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







<View >
  

  <Text style={styles.label}>Nome do animal</Text>
  <TextInput style={styles.input} placeholderTextColor='#999'autoCorrect={false} onChangeText={text => onChangeText(text)}/>
  
   <Text style={styles.label}>Idade</Text>
  <TextInput 
                    style={styles.input}
                    
                    placeholderTextColor='#999'
                    autoCapitalize="words"
                    autoCorrect={false}
                    onChangeText={text => onChangeText(text)}
                />

<Text style={styles.titleName}>Tipo</Text>
<Picker
selectedValue={selectedValue}
        style={styles.pickerAnimal}
        onValueChange={(itemValue, itemIndex) => setSelectedValue(itemValue)}>
        <Picker.Item label="Java" value="java" />
        <Picker.Item label="JavaScript" value="js" />
</Picker>

<Text style={styles.titleName}>Estado atual</Text>
<Picker
selectedValue={selectedValue}
        style={styles.pickerAnimal}
        onValueChange={(itemValue, itemIndex) => setSelectedValue(itemValue)}>
        <Picker.Item label="Java" value="java" />
        <Picker.Item label="JavaScript" value="js" />
</Picker>             
    
   
    <TouchableOpacity style={styles.buttonAdd} onPress={postAnimal}>
    <Text style={styles.textAdd}>Adicionar</Text>
<Feather name="plus" size={35} color="#ffffff" />

</TouchableOpacity>


</View>
    
</View>
    
);


    
}
