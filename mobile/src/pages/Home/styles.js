import { StyleSheet } from 'react-native';
import Constants from 'expo-constants';


export default StyleSheet.create({

container:{
    paddingTop: Constants.statusBarHeight,
    margin: 0},

header: {
    height: 250,
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center'},

imgHeader :{
    height: 230},

   
options : {
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'space-around',
        flexDirection: 'row',
    marginTop: 30},
     
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
    width: 150,
    borderRadius: 10,
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    flexDirection: 'column'},

iconOption : {
    height: 60,
    width: 60},






    
});




