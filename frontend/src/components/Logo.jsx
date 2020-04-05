import React from 'react';
import logo from '../images/logo.jpg'
import styled from 'styled-components';

const Image = styled.img`
    height: 100%;
    margin: 10px;
    padding-right: 10px;
`;

const A = styled.a`
    height: 100%;
`;

export default function Logo(props){
    return <A href={props.link}><Image src={logo} alt="Logo" /></A>
}