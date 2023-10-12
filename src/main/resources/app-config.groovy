import ru.vbutkov.spring_ioc_di.bean.FirstBean
import ru.vbutkov.spring_ioc_di.bean.SecondBean
import ru.vbutkov.spring_ioc_di.bean.ThirdBean

beans {
    secondBean(SecondBean) { bean ->
        bean.scope = 'prototype'
    }

    firstBean(FirstBean, secondBean)

    thirdBean(ThirdBean, secondBean)
}