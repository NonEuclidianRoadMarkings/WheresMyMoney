import React from 'react';
import {
    Alert,
  Button,
  Image,
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  View,
} from 'react-native';

function LumpSumWithdrawalGuidance(props): React.JSX.Element {

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
            backgroundColor: '#FFFFFF',
            padding: 24,
          }}>
          <Text style={styles.title}>Wealth Wizards Lump Sum Guidance</Text>
          <Image source={require('./wealth_wizards_splash.png')} />
          <Text style={styles.body}/>
          <Text style={styles.body}>Name: Mr. Willy Wonka</Text>
          <Text style={styles.body}>Address: 120 Cockfosters Road</Text>
          <Text style={styles.body}>         Barnet</Text>
          <Text style={styles.body}>United Kingdom</Text>
          <Text style={styles.body}>EN4 0DZ</Text>
          <Text style={styles.body}/>
          <Text style={styles.body}>Profiterole Pension Plan Plus</Text>
          <Text style={styles.body}>Type: Defined Contribution</Text>
          <Text style={styles.body}>Value: £123,456</Text>
          <Text style={styles.body}>Commencement Age: 55</Text>
          <Text style={styles.body}/>
          <Text style={styles.body}>Patisserie Pension Plus Tard</Text>
          <Text style={styles.body}>Type: Defined Benefit</Text>
          <Text style={styles.body}>Value: £2,112 per month</Text>
          <Text style={styles.body}>Commencement Age: 65</Text>
          <Text style={styles.body}/>
          <Button
            onPress={() => Alert.alert('Thanks for confirming!')}
            title="Looks About Right"
            color="#FC4444"
            accessibilityLabel="Looks About Right"
            />
          <Button
            onPress={() => Alert.alert('Correct your data to continue')}
            title="Make a Correction"
            color="#308000"
            accessibilityLabel="Make a Correction"
            />
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

export default LumpSumWithdrawalGuidance;
