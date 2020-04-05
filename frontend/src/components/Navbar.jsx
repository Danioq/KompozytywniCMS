import React from 'react';
import Navitem from './Navitem'
import Logo from './Logo'
import styled from 'styled-components';


const Nav = styled.nav`
    height: 100px;
    align-items: center;
    display: flex;
    margin: auto;
    width: 100%;
    justify-content: center;
`;

export default function Navbar() {
    return <Nav>
        <Logo link="#"/>
        <Navitem name="Aktualności" link="#"/>
        <Navitem name="O Nas" link="#"/>
        <Navitem name="Projekty" link="#"/>
        <Navitem name="Galeria" link="#"/>
    </Nav>;
}