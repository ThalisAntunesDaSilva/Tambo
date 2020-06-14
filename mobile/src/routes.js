import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';

const AppStack = createStackNavigator();
import Home from './pages/Home';
import AddAnimal from './pages/AddAnimal';
import Animals from './pages/Animals';



export default function Routes(){
    return(
<NavigationContainer>
    <AppStack.Navigator screenOptions={{ headerShown: false }}>
<AppStack.Screen name="Home" component={Home} />
<AppStack.Screen name="AddAnimal" component={AddAnimal} />
<AppStack.Screen name="Animals" component={Animals} />

</AppStack.Navigator>
</NavigationContainer>
    );
}
