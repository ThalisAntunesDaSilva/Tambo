import React from 'react';
import { View, Image, Text, TouchableOpacity, ScrollView,StatusBar} from 'react-native';
import logoImg from '../../assets/logo.png';
import header from '../../assets/header.jpg';
import profile from '../../assets/profile.jpg';
import cowOption from '../../assets/cowOption.png';
import moneyOption from '../../assets/moneyOption.png';
import graphicOption from '../../assets/graphicOption.png';
import milkOption from '../../assets/milkOption.png';
import styles from './styles';
import {useNavigation} from '@react-navigation/native';


export default function Home(){

    const navigation = useNavigation();

function navigateToAnimals(){
    navigation.navigate('Animals')
}







    return (

<View style={styles.container}>
<StatusBar
    barStyle = "dark-content"
   
    backgroundColor = "#0066CC"
   
  
/>

            <View style={styles.header}>
            
            
            <View style={styles.profilebox}>
            <Image style={styles.profile} source={profile}></Image>
             </View>
           
   
      <Text style={styles.textWelcome}>Bem-vindo, produtor(a)</Text>
   
 </View>
<ScrollView>
<View style={styles.options}>

<TouchableOpacity style={styles.buttonOption} onPress={navigateToAnimals}>
    <Image style={styles.iconOption} source={cowOption}></Image>
        <Text style={styles.textOption}>Animais</Text>
            </TouchableOpacity>

<TouchableOpacity style={styles.buttonOption} onPress={navigateToAnimals}>
    <Image style={styles.iconOption} source={moneyOption}></Image>
        <Text style={styles.textOption}>Gestão</Text>
            </TouchableOpacity>
</View>
            
            <View style={styles.options}>

<TouchableOpacity style={styles.buttonOption} onPress={navigateToAnimals}>
    <Image style={styles.iconOption} source={milkOption}></Image>
        <Text style={styles.textOption}>Produção</Text>
            </TouchableOpacity>

<TouchableOpacity style={styles.buttonOption} onPress={navigateToAnimals}>
    <Image style={styles.iconOption} source={graphicOption}></Image>
        <Text style={styles.textOption}>Estatísticas</Text>
            </TouchableOpacity>
            
           

</View>
</ScrollView>







</View>

    );
}
