import React from 'react';
import {ScienceClubContainer} from './styledElements'


let header = <h1>Kompozytywni</h1>

let desc = <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vitae risus nec ligula sollicitudin sodales. Nulla nec lorem mi. Donec sed dui nunc. Suspendisse sollicitudin ante neque, non semper ex bibendum vitae. Morbi consectetur consequat enim, at sagittis dolor sodales quis. Nulla facilisi. Praesent lobortis dapibus velit sit amet condimentum.

In nec metus id lorem lobortis hendrerit. Donec efficitur, nisl ut tincidunt finibus, augue lectus pretium ipsum, eget blandit massa dolor eu lectus. Vestibulum gravida, turpis sed mollis aliquam, diam libero porttitor neque, nec vehicula odio velit eu lectus. Nam a mauris ac urna ornare hendrerit. Nulla et diam commodo, suscipit augue eget, porta augue. Praesent faucibus justo et rutrum consequat. Aenean commodo tellus leo, pretium auctor neque scelerisque sit amet. Suspendisse vitae ex et odio tristique porta. Proin quam nunc, tincidunt nec tortor a, tincidunt hendrerit sapien. Mauris vitae libero laoreet quam tempus accumsan quis eu leo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed interdum nisl vitae molestie pretium.

Mauris lobortis mollis nibh eu maximus. Donec et tellus congue, molestie arcu ut, tincidunt risus. Aenean ut sem velit. Integer dignissim, odio at convallis tincidunt, libero massa scelerisque elit, ut rutrum mauris lacus eu magna. Sed vel aliquet quam. Praesent accumsan id velit condimentum semper. In hac habitasse platea dictumst. Aliquam malesuada consequat mauris, et fringilla nisi pellentesque vitae. Suspendisse suscipit cursus velit, ut aliquet erat pharetra et. Morbi et posuere magna, eu volutpat est. Phasellus placerat vitae lorem at pulvinar. Proin sed eleifend lectus. Suspendisse cursus varius augue vel ornare. Donec bibendum pellentesque nibh, id ullamcorper mauris aliquam eget. Cras vulputate eu nisl a mollis.

Morbi pharetra ut ligula nec laoreet. Donec lacinia felis vel dui tristique, in ultrices neque aliquam. Nulla orci lorem, fringilla vel ullamcorper vitae, pulvinar a dui. Maecenas ac eros sed dolor congue tristique nec eget quam. Proin vel quam eros. Ut dolor risus, egestas sit amet dui at, eleifend posuere dui. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aliquam faucibus ante nec ullamcorper tristique. Phasellus dapibus lacus at feugiat fermentum. Cras euismod porta dapibus. Aliquam ut maximus sem. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec nulla lorem, gravida a mattis eu, scelerisque sit amet nibh. Fusce at sapien quis dolor efficitur maximus et ac quam.

Ut vitae mi diam. Curabitur quis libero quis tortor pulvinar vehicula. Nunc gravida neque sit amet dapibus scelerisque. Duis lacinia fringilla urna quis suscipit. Aenean ut mauris vel ex vulputate pulvinar sed sollicitudin urna. Proin eget accumsan neque, et efficitur eros. Mauris fringilla, ante sed porttitor varius, est lacus tempor elit, faucibus lacinia diam purus a nunc. Donec aliquam dignissim commodo. Pellentesque et nibh auctor, vehicula nulla a, lacinia tellus. Nam quis volutpat erat. Proin eleifend sollicitudin sollicitudin. Donec condimentum turpis nisl, a blandit elit pulvinar id. Vestibulum quis risus varius, feugiat erat eget, ultrices eros. Pellentesque sit amet mi varius, egestas lacus sit amet, malesuada est.
</p>


export default function ScienceClub(props) {
    return <ScienceClubContainer>   
    {header}
    {desc}
    </ScienceClubContainer>
}