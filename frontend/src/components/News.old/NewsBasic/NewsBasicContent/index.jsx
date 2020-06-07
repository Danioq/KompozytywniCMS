import React from 'react';
import styled from 'styled-components';
import NewsBasicTitle from 'components/News/NewsBasic/NewsBasicContent/NewsBasicTitle';
import NewsBasicText from 'components/News/NewsBasic/NewsBasicContent/NewsBasicText';
import NewsBasicAddDate from 'components/News/NewsBasic/NewsBasicContent/NewsBasicAddDate';


const NewsContent = styled.div`
    align-items: center;
    display: grid;
    grid-template-columns: 1fr, 2fr, 1fr;
    grid-auto-flow: row;
    margin: auto;
    justify-content: space-between;
`;

export default function NewsBasicContent(props) {
    return <NewsContent>
        <NewsBasicTitle title={props.title}/>
        <NewsBasicText textContent={props.textContent}/>
        <NewsBasicAddDate addDate={props.addDate} addTime={props.addTime} />
    </NewsContent>;
}