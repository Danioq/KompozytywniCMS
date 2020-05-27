import React, {useState} from 'react';
import LoginPanel from './LoginPanel'
import AdminPanel from './AdminPanel'
// import styled from 'styled-components';

export default function Admin() {
    const [isLoged, setIsLoged] = useState(false);
    if(!isLoged) {
        return <LoginPanel login={() => setIsLoged(true)}/>;
    } else {
        return <AdminPanel />
    }
}