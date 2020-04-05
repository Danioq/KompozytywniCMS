import React from 'react';
import Navitem from './Navitem'
import Logo from './Logo'

export default function Navbar() {
    return <nav>
        <Navitem name="Aktualności" link="#"/>
        <Navitem name="O Nas" link="#"/>
        <Logo />
        <Navitem name="Projekty" link="#"/>
        <Navitem name="Galeria" link="#"/>
    </nav>;
}