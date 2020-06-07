import React from 'react';
import styled from 'styled-components';

const AdditionDate = styled.p`
`;

export default function NewsBasicAddDate(props) {
    return <AdditionDate>
        {props.addDate} {props.addTime}
    </AdditionDate>    
}