import React from 'react';
import { View, Image, Text, TouchableOpacity } from 'react-native';
import logoImg from '../../assets/logo.png';
import styles from './styles';

export default function Home(){
    return (
<View style={styles.container}>
 <View style={styles.header}>
  <Image source={logoImg} />
  <Text style={styles.headerText}>Bem-vindo produtor(a)!</Text>
    </View>

<View style={styles.descricao}>
    <Text style={styles.description}>Escolha uma opção a baixo</Text>
</View>

<View style={styles.opcoes1}>

<TouchableOpacity style={styles.opcao} onPress={() => {}}>
<Text style={styles.opcaoTexto}>Animais</Text>
</TouchableOpacity>
<TouchableOpacity style={styles.opcao} onPress={() => {}}>
<Text style={styles.opcaoTexto}>Nascimentos</Text>
</TouchableOpacity>
</View>

<View style={styles.opcoes2}>

<TouchableOpacity style={styles.opcao} onPress={() => {}}>
<Text style={styles.opcaoTexto}>Produção</Text>
</TouchableOpacity>
<TouchableOpacity style={styles.opcao} onPress={() => {}}>
<Text style={styles.opcaoTexto}>Balanço</Text>
</TouchableOpacity>
</View>

<View style={styles.opcoes3}>

<TouchableOpacity style={styles.opcao} onPress={() => {}}>
<Text style={styles.opcaoTexto}>Despesas</Text>
</TouchableOpacity>
<TouchableOpacity style={styles.opcao} onPress={() => {}}>
<Text style={styles.opcaoTexto}>Calendário</Text>
</TouchableOpacity>
</View>








</View>

    );
}
