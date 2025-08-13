import React from 'react';
import TurboEncabulator from './TurboEncabulator';
import LoremIpsom from './LoremIpsom';

function ReactNativeApp(props): React.JSX.Element {
    switch(props.componentName.toString()) {
        case 'TurboEncabulator': return TurboEncabulator(props);
        default: return LoremIpsom(props);
    }
}

export default ReactNativeApp;