import React, {useState} from 'react';
import LoginPanel from './LoginPanel'
// import styled from 'styled-components';

export default function Admin() {
    const [isLoged, setIsLoged] = useState(false);
    if(!isLoged) {
        return <LoginPanel login={() => setIsLoged(true)}/>;
    }
    return <div>Admin</div>;
}