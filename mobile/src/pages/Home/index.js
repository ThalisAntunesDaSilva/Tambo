import React from 'react';
import { View, Image, Text, TouchableOpacity} from 'react-native';
import logoImg from '../../assets/logo.png';
import header from '../../assets/header.jpg';
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
            <View style={styles.header}>
           <Image source={header} style={styles.imgHeader} />
                                                        </View>
   


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








</View>

    );
}
