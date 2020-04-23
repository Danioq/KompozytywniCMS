import React from 'react';
import styled from 'styled-components';
import NewsBasic from 'components/News/NewsBasic';
import image from 'images/industry_news.jpg'

const NewsContainer = styled.div`
    margin-top: 40px;
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    grid-auto-flow: row;
    justify-items: center;
    row-gap: 20px;
`;

export default function News(props) {
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
    return (<NewsContainer>
        {data.map(elem => 
            <NewsBasic  title={elem.title}
                        photo = {elem.photo}
                        textContent = {elem.textContent}
                        addDate = {elem.addDate}
                        addTime = {elem.addTime} />)}
    </NewsContainer>
    )
}