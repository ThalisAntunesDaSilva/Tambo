import { StyleSheet } from 'react-native';
import Constants from 'expo-constants';

export default StyleSheet.create({
    container: {
        paddingTop: Constants.statusBarHeight,
        margin: 0
    },

    header: {
      height: 60,
      display: 'flex',
      justifyContent: 'space-between',
      alignItems: 'center',
      flexDirection: 'row',
      paddingLeft: 20,
      paddingRight: 20,
      paddingTop: 10


    },

    buttonAdd: {
        shadowColor: 'rgba(0,0,0, .4)', // IOS
        shadowOffset: { height: 1, width: 1 }, // IOS
        shadowOpacity: 1, // IOS
        shadowRadius: 1, //IOS
        backgroundColor: '#fff',
        elevation: 2, // Android
        height: 40,
        width: 90,
        justifyContent: 'center',
        alignItems: 'center',
        flexDirection: 'row',
        borderRadius: 40 },

    
        headerText: {
        fontSize: 15,
        color: '#737380'
    },

    searchBox:{ 
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center'
    },
    
    inputSearch:{
        shadowColor: 'rgba(0,0,0, .4)', // IOS
        shadowOffset: { height: 1, width: 1 }, // IOS
        shadowOpacity: 1, // IOS
        shadowRadius: 1, //IOS
        backgroundColor: '#fff',
        elevation: 2, // Android
        height: 40,
        width: 280,
        paddingLeft: 20,
        display: 'flex',
        alignItems: 'center',
        flexDirection: 'row',
        borderRadius: 40,
},


filterList:{
display: 'flex',
justifyContent: 'space-around',
alignItems: 'center',
flexDirection: 'row',
height: 60
},

filterbutton: {
    shadowColor: 'rgba(0,0,0, .4)', // IOS
    shadowOffset: { height: 1, width: 1 }, // IOS
    shadowOpacity: 1, // IOS
    shadowRadius: 1, //IOS
    elevation: 2, // An
    backgroundColor: '#000000',
    height: 30,
    width: 80,
    borderRadius: 8,
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    marginBottom: -4},

filterTextButton: {
    color: '#ffffff'
},

animalBox: {
marginLeft: 20,
marginRight: 20,
height: 130,
shadowColor: 'rgba(0,0,0, .4)', // IOS
shadowOffset: { height: 1, width: 1 }, // IOS
shadowOpacity: 1, // IOS
shadowRadius: 1, //IOS
backgroundColor: '#fff',
elevation: 2, // Android
marginBottom: 20,
display: 'flex',
alignItems: 'center',
justifyContent: 'space-around',
flexDirection: 'row',
},

animalDetails: {
display: 'flex',
flexDirection: 'row',
justifyContent: 'center'
},

vacaProperty : {
fontWeight: 'bold'
},

   

    animalImg :{
        height: 90,
        width: 60,
        borderRadius: 5
    },

    deleteButton:{
        marginTop: -50
    }
    
});