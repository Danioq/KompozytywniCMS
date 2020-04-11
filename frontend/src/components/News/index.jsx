import React from 'react';
import styled from 'styled-components';
import NewsBasic from 'components/News/NewsBasic';
import image from 'images/industry_news.jpg'

const NewsContainer = styled.div`
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    grid-auto-flow: row;
    justify-items: center;
    row-gap: 20px;
`;

export default function News(props) {
    const news = [];
    const data = [{
        title: 'title1',
        photo: image,
        textContent: 'content1',
        addDate: '11.04.2020',
        addTime: '15:00'
    }, 
    {
        title: 'title2',
        photo: 'images/industry_news.jpg',
        textContent: 'content2',
        addDate: '11.04.2020',
        addTime: '15:00'
    }, 
    {
        title: 'title3',
        photo: 'images/industry_news.jpg',
        textContent: 'content3',
        addDate: '11.04.2020',
        addTime: '15:00'
    }];
    for (const [index, value] of data.entries()) {
        news.push(<NewsBasic title = {value.title} 
            photo = {value.photo} 
            textContent = {value.textContent} 
            addDate = {value.addDate}
            addTime = {value.addTime}/>)
    }
    return (<NewsContainer>
        {news}
    </NewsContainer>
    )
}