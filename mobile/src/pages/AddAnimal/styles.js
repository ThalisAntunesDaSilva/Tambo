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







input : {
    borderWidth: 1,
    borderColor: '#727286',
    padding: 8,
    borderRadius: 4
},
 
});




