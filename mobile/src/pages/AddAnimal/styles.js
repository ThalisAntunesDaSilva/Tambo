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
    margin: 10,
    width: 250,
    borderRadius: 15
},

addAnimalBox:{
marginTop: 30,
backgroundColor: '#ffff',
borderRadius: 15,
height: 300,
justifyContent: 'center',
alignItems: 'center',
flexDirection: 'column'
},

titleName: {
    padding: 13,
    marginTop: -80,
    fontWeight: 'bold',
    fontSize: 20

},

textAdd: {
    color: '#ffff',
    fontSize: 20,
    marginLeft: 10,
    marginBottom: 5

 },

buttonAdd: {
   
   marginTop: 50,
    backgroundColor: '#000000',
    width: 250,
    borderRadius: 15,
    flexDirection: 'row',
    justifyContent: 'space-around',
    alignItems: 'baseline'
},
 
});




