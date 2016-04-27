1.to(10).map(3*_).filter(_%5==2)

//If an operator ends in :, it is right associative
//1::2::3::Nil == (1::(2::(3::Nil)))
//map(key)=map.apply(key)