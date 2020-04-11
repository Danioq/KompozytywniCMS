import React from 'react';
import styled from 'styled-components';

const Title = styled.div`
  width: 310px;

  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 24px;
  line-height: 28px;
  display: flex;
  align-items: center;

  color: #000000;
`;

export default function NewsBasicTitle(props) {
    return <Title>
        {props.title}
    </Title>    
}