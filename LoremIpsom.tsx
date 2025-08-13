import React from 'react';
import {
  Image,
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  View,
} from 'react-native';

function LoremIpsom(props): React.JSX.Element {

  const backgroundStyle = {
    backgroundColor: '#FFFFFF',
  };

  return (
    <SafeAreaView style={backgroundStyle}>
      <StatusBar
        barStyle={'light-content'}
        backgroundColor={backgroundStyle.backgroundColor}
      />
      <ScrollView
        contentInsetAdjustmentBehavior="automatic"
        style={backgroundStyle}>
        <View
          style={{
            backgroundColor: '#DDDDDD',
            padding: 24,
          }}>
          <Text style={styles.title}>Proin a Libero Sapien</Text>
          <Image source={require('./lorem-ipsom.png')} style={{height: 150, width: 350}} resizeMode={'contain'} />
          <Text style={styles.body}/>
          <Text style={styles.body}>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non tortor bibendum, tempus nibh porta, laoreet lacus.</Text>
          <Text style={styles.body}/>
          <Text style={styles.body}>Praesent vitae blandit massa. Phasellus pretium metus vitae purus feugiat, a congue orci sollicitudin. Nullam nec feugiat nisl. Vivamus eleifend enim est, ut feugiat lacus auctor luctus. In imperdiet ligula enim, eu viverra orci lobortis vel.</Text>
          <Text style={styles.body}/>
          <Text style={styles.body}>Suspendisse in sem ac quam aliquet elementum ac ut purus. Curabitur lobortis ante ut luctus commodo. Nulla massa risus, dictum in dui non, congue tempus magna. Fusce augue lectus, suscipit ut purus quis, euismod lobortis dui. Ut eu facilisis risus, quis consectetur risus. Etiam elementum aliquet fermentum.</Text>
          <Text style={styles.body}/>
          <Text style={styles.body}>Suspendisse id lorem eros. Morbi varius, massa euismod dictum consectetur, justo massa ultrices lacus, vel mattis risus tellus id est. Phasellus nec elit viverra neque faucibus scelerisque sollicitudin sit amet enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed molestie dolor eu lorem consequat, et ultrices nibh posuere. In velit ligula, consequat quis egestas nec, porttitor et arcu. Duis in justo viverra, efficitur nibh vel, auctor elit.</Text>
          <Text style={styles.body}/>
          <Text style={styles.body}>Proin urna elit, accumsan sit amet ex quis, varius pretium purus. Morbi eget porta sem. Sed efficitur tristique vulputate. Nulla a dolor vel erat dictum tempus et non mauris. In orci arcu, laoreet condimentum ante a, posuere tristique tellus. Etiam tincidunt ultricies nunc, ac laoreet metus lobortis pulvinar. </Text>
        </View>
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  title: {
    fontSize: 28,
    fontWeight: '600',
    textAlign: 'center',
  },
  bold: {
    fontWeight: '700',
  },
  body: {
    fontSize: 20,
    fontWeight: '500',
  },
});

export default LoremIpsom;