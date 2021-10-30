
-----Controller类命名---
门诊医生加 Od_开头  以Controller结尾 role = 1
医技医生加Md_开头 以Controller结尾   role = 2
药房医生加Rd_开头  以Controller结尾  role = 3
挂号收费员以sf_开头 以Controller结尾 role = 4
超级管理员使用Admin_开头 *  role = 5


----对应的model,mapper都需要使用下对应的包进行分类
od包、md包、rd包、sf包  admin

方聪
---
病人看诊的状态有三种 1 未看诊，2 看诊中 ，3 确诊
