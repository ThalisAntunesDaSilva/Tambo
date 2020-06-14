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
        justifyContent: 'space-between',
        alignItems: 'center'
    },

    headerText: {
        fontSize: 15,
        color: '#737380'
    },
    textButton:{
        color: '#000000'
    },

    Button : {
        flexDirection: 'row',
        justifyContent: 'space-around',
        alignItems: 'baseline'
    },

    headerTextBold: {
        fontWeight: 'bold',
    },

  
    animalsList: {
        marginTop: 32,
     },

    vaca: {
        padding: 24,
        borderRadius: 8,
        backgroundColor: '#FFF',
        marginBottom: 16,
        height: 90,
        justifyContent: 'space-between',
        alignItems: 'baseline'
       , flexDirection: 'row' 
    },

    vacaProperty: {
        fontSize: 14,
        color: '#41414d',
        fontWeight: 'bold',
    },

    vacaValue: {
        marginTop: 8,
        fontSize: 15,
        marginBottom: 24,
        color: '#737380',
    }
    
});