import { StyleSheet } from 'react-native';
import Constants from 'expo-constants';


export default StyleSheet.create({

container:{
    paddingTop: Constants.statusBarHeight,
    margin: 0},

header: {
    height: 170,
    paddingTop: 20,
    paddingRight: 20,
    paddingLeft: 20,
},

profilebox: {
    display: 'flex',
    alignItems: 'flex-end',
    marginBottom: 30,
},

    textWelcome: {
        fontSize: 20,
        fontWeight: 'bold',
    },

profile: {
    height: 60,
    width: 60,
    borderRadius: 100,
   
    
},

   
options : {
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'space-around',
        flexDirection: 'row',
    marginTop: 15,
marginBottom: 15,
},
     
buttonOption: {
    shadowColor: 'rgba(0,0,0, .4)', // IOS
    shadowOffset: { height: 1, width: 1 }, // IOS
    shadowOpacity: 1, // IOS
    shadowRadius: 1, //IOS
    backgroundColor: '#fff',
    elevation: 2, // Android
    height: 50,
    width: 100,
    justifyContent: 'center',
    alignItems: 'center',
    flexDirection: 'row',
    height: 150,
    width: 140,
    borderRadius: 10,
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    flexDirection: 'column'},

iconOption : {
    height: 60,
    width: 60},






    
});




