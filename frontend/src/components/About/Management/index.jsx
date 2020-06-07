import React from 'react';
import Member from './Member'
import { ManagementList } from './styledElements'
import natalia from './Natalia.jpg'
import martyna from './Martyna.jpg'
import igor from './Igor.jpg'

const mList = [
    { name: 'Natalia Raźny', img : natalia, function: 'Przewodnicząca', description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.'},
    { name: 'Martyna Konowalska', img : martyna, function: 'Wiceprzewodnicząca ds. PR', description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.'},
    { name: 'Igor Sawicki', img : igor, function: 'Wiceprzewodniczący ds. Finansów', description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.'},
];

export default function Management(props){
    return <ManagementList>
        {mList.map(e => <Member 
                        name={e.name} 
                        img={e.img} 
                        function={e.function} 
                        description={e.description} /> )}
    </ManagementList>
}