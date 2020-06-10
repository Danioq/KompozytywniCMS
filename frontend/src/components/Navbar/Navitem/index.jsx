import React from 'react';
import styled from 'styled-components';
import {Link} from 'react-router-dom';

const Item = styled.button`
    background-color: transparent;
    border: none;
    color: #7FFE02;
    font-weight: bold;
    font-size: 5vh;
    margin: 30px;
    vertical-align: center;
    outline: none;
    outline-color: white;
    transition: color 1s, transform 1s;
    :hover {
        cursor: pointer;
        transform: scale(1.05);
    }
    :focus {
        outline: 0;

    }
    }
`;
    

export default function Navitem(props) {
    return <Link to={props.link}>
        <Item>
            {props.name}
        </Item>
    </Link>
}