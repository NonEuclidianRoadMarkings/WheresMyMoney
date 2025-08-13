# Wheres My Money Demo

Demo Showing How to Load React Native Modules in a Native Android Mobile App 

The Article cards start a full-screen React Native Activity which displays an article written in JavaScript (not a web view)

The Guidance cards start an embedded React Native fragment (not a new Activity) which displays a guidance journey written in JavaScript (not a web view)

This demo was run with a Metro server on localhost which bundles and serves the JS modules when a React Native module is loaded. It is possible to load the React Native modules locally from within the app, from a remote CDN, or a mix of both.

In this demo, `ReactNativeApp.tsx` serves as a loader which is passed a 'componentName' from the native Android fragment, which is then loaded on-demand.

The react modules can also pass data out to the native modules, using a variety of methods, if needed.

![App Demo](./app_demo.gif)

# Demo Purpose

This purpose of this demo and related research is to evaluate whether React Native would be a useful tool to enable code to be developed which is common between a native mobile app and a web app.

[Integrate React Native with an Existing Native Mobile App](https://reactnative.dev/docs/integration-with-existing-apps)

# TL;DR - React Native Modules Can Provide

- a good alternative to Web Views for loading on-demand content

- a way to replace disparate native mobile app and web modules with React modules which share most of their code between iOS/Android/Web

# Demo Scope

Develop an app for Android and Web that exposes the same functionality in each platform.

iOS is out of scope - this demo should only be Android - but iOS compatibilty should be considered.

Use a Design System to style the application, if possible.

The shell of the mobile app should be native Kotlin/Java, not React Native JavaScript.

Login to the app via an external OAUth 2.0 Identity Provider.

Present a 'home page' displaying some read only data.

Present a 'form page' for displaying and updating write data.

Assume an API exists that all versions of the app can use to read/write data for the app.

# Outcomes

## ❌️ Sharing Code Between React Native and Native iOS/Android Code

...

## ✅ Sharing Code Between React Native and React Web

All the code except for the UI widgets can be shared between React Native and React Web:

✅ State Management (Context API, Redux, etc.)

✅ Business Logic

✅ Services (Authentication, API Access, etc.)

✅ Database Connectivity

❌️ UI Widgets

✅ Design System (Style Dictionary works with React Web and React Native)

[Sharing Code between React Native and React JS](https://blog.bitsrc.io/learn-to-share-code-between-react-native-and-react-js-14065ce5b0c3)

[GitHub repo - reusingCode](https://github.com/HBandesh/reusingCode)

[GitHub repo - hitButtonContainerComponent.js](https://github.com/HBandesh/reusingCode/blob/master/platform/thanosHitButton/hitButtonContainerComponent.js)

Summarized from the above article:

>make two various files with the extensions below:
>
>button.js (a view of the React button)
>
>button.native.js (a view of the React Native button)
>
>Then, create a container component, "button", which imports either the web or native view.
>
>The container component can be imported in common web/native React code like:
>
>import Button from "./button"
>
>The bundler (such as WebPack) will automatically pick the button.js while 
>making a web bundle, or pick button.native.js for mobile.

## ❓ What JavaScript can be shared between React Native and Web

...