import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  Easing,
  Animated,
  TouchableHighlight,
  ScrollView
} from 'react-native';

import CustomNav from '../../src/component/customNav/customNav'
export default class simpleAnimations extends Component {

  constructor (props) {
    	super(props);
      this.animatedValue = new Animated.Value(0)
      this.state = {openDrawer:props.openDrawer,navigation:props.navigation}
    }
    componentWillMount(){
      this._animatedValue = new Animated.Value(0);
    }

    componentDidMount(){
      Animated.timing(this._animatedValue, {
        toValue: 100,
        duration: 3000
    }).start();
    }

    animate (easing) {
        this.animatedValue.setValue(0)
          Animated.timing(
            this.animatedValue,
            {
              toValue: 1,
              duration: 1000,
              easing
            }
        ).start()
      }

  render() {
    const marginLeft = this.animatedValue.interpolate({
      inputRange: [0, 1],
      outputRange: [0, 260]
    })

    var interpolatedColorAnimation = this._animatedValue.interpolate({
      inputRange: [0, 100],
    outputRange: ['rgba(0,0,0, 1)', 'rgba(255,255,255, 1)']
  });

    return (
      <Animated.View style={[styles.container, {backgroundColor: interpolatedColorAnimation}]}>
      <CustomNav  openDrawer = {()=>this.props.openDrawer}/>
       <ScrollView>
         <Button easing='Tinder Card Swipe' onPress={()=>this.props.navigation.navigate('MoveWithFinger')}/>
          <Button easing='Preview' onPress={()=>this.props.navigation.navigate('DemoPage')}/>
          <Button easing='Flip' onPress={()=>this.props.navigation.navigate('Flip')}/>
          <Button easing='More Animation' onPress={()=>this.props.navigation.navigate('MoreAnimation')}/>
          <Button easing='Rotate' onPress={()=>this.props.navigation.navigate('Spin')}/>
          <Button easing='Metarial Control' onPress={()=>this.props.navigation.navigate('MetarialScreen')}/>
          <Button easing='Spring' onPress={()=>this.props.navigation.navigate('Spring')}/>
          <Button easing='Multiple Animations' onPress={()=>this.props.navigation.navigate('Multiple')}/>
          
      	</ScrollView>
      </Animated.View>
    );
  }
}


const Button = ({onPress, easing}) => (
	<TouchableHighlight style={styles.button}  onPress={onPress}>
    <Text>{easing}</Text>
  </TouchableHighlight>
)

var styles = StyleSheet.create({
  container: {
    flex: 1,

  },
  button: {
  	height: 60,
    marginLeft: 10,
    marginRight: 10,
    backgroundColor: '#ededed',
    justifyContent: 'center',
    alignItems: 'center',
    marginTop: 10
  },
  block: {
  	width: 50,
    height: 50,
    backgroundColor: 'red'
  }
});
