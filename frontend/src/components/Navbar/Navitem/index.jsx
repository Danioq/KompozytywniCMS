import React from 'react';
import styled from 'styled-components';

const A = styled.a`
    justify-content: center;
`;

const Item = styled.button`
    background-color: transparent;
    border: none;
    color: #7FFE02;
    font-weight: bold;
    font-size: 5vh;
    margin: 30px;
    vertical-align: center;
    outline: none;
    transition: color 1s, transform 1s;
    :hover {
        cursor: pointer;
        color: green;
        transform: scale(1.05);
    }
`;
export default function Navitem(props) {
    return <A href={props.link}>
        <Item>
            {props.name}
        </Item>
    </A>
}