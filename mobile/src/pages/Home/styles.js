import { StyleSheet } from 'react-native';
import Constants from 'expo-constants';


export default StyleSheet.create({
container: {
flex: 1,
paddingHorizontal: 24,
paddingTop: Constants.statusBarHeight + 20,
},

header: {
    flexDirection: 'row',
    justifyContent :  'space-between',
    alignItems: 'center'
},
    headerText : {
        fontSize: 15,
        color: '#727286'
    },

    headerTextBold: {
        fontWeight: 'bold'
    },

    description: {
        fontSize: 16,
        lineHeight: 24,
        color: '#737380',
        marginLeft: 50,
        fontWeight: 'bold'
    },

 opcoes1:{
     marginTop: 5,
     borderRadius: 8,
     flexDirection: 'row',
    
},
opcoes2:{
    marginTop: 25,
    borderRadius: 8,
    flexDirection: 'row'
},
opcoes3:{
    marginTop: 25,
    borderRadius: 8,
    flexDirection: 'row',
    
    
},
    opcao: {
      marginRight: 10,
        backgroundColor: '#000000',
       borderRadius: 8,
        height: 160,
        width: '50%',
        justifyContent: 'center',
        alignItems: 'center'
},

opcaoTexto:{
    color: '#FFF',
    fontSize: 20,
    fontWeight: 'bold'
}
});




