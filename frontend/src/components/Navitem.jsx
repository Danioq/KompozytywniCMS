import React from 'react';

export default function Navitem(props) {
    return <a href={props.link}>
        <button>
            {props.name}
        </button>
    </a>
}