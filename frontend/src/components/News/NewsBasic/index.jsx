import React from 'react';
import styled from 'styled-components';
import NewsBasicContent from 'components/News/NewsBasic/NewsBasicContent';
import NewsBasicImage from 'components/News/NewsBasic/NewsBasicImage';

const NewsTile = styled.div`
  width: 550px;
  height: 240px;

  display: grid;
  grid-template-columns: 1fr, 2fr;
  grid-auto-flow: row;

  background: #efefef;
  border: 5px solid;
  border-radius: 20px;
  border-color: #79DC08;

  &:hover {
    background: #C4C4C4;
  }
`;

export default function NewsBasic(props) {
    return <NewsTile>
        <NewsBasicImage photo = {props.photo} />
        <NewsBasicContent title = {props.title} textContent = {props.textContent} addDate = {props.addDate} addTime = {props.addTime} />
    </NewsTile>;
}