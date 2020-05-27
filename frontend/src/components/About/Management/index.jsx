import React, {useState} from 'react';
import Member from './Member'
import { ManagementList } from './styledElements'



export default function Management(props){
    const [membersFetched, setMembersFetched] = useState(false);
    const mList = [];
    let fetchMembers = async () => {
        //fetch members here
        setMembersFetched(true);
    }
    fetchMembers();
    if(membersFetched)
    {
    return <ManagementList>
        {mList.map(element => <Member data={element} /> )}
        </ManagementList>
    } else {
        return <></>
    }
}