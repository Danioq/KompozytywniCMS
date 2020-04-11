import React from 'react';
import Navitem from './Navitem'
import Logo from 'components/Logo'
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
        <Logo link="/"/>
        <Navitem name="Aktualności" link="/news"/>
        <Navitem name="O Nas" link="/about"/>
        <Navitem name="Projekty" link="/projects"/>
        <Navitem name="Galeria" link="/galery"/>
    </Nav>;
}