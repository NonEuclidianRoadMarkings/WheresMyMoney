# WheresMyMoney

Demo Showing How to Load React Native Modules in a Native Android Mobile App 

The Article cards start a full-screen React Native Activity which displays an article written in JavaScript (not a web view)

The Guidance cards start an embedded React Native fragment (not a new Activity) which displays a guidance journey written in JavaScript (not a web view)

This demo was run with a Metro server on localhost which bundles and serves the JS modules when a React Native module is loaded. It is possible to load the React Native modules locally from within the app, from a remote CDN, or a mix of both.

In this demo, `ReactNativeApp.tsx` serves as a loader which is passed a 'componentName' from the native Android fragment, which is then loaded on-demand.

The react modules can also pass data out to the native modules, using a variety of methods, if needed.

![App Demo](app_demo.gif)

