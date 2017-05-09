# 1.Response
##### success
```javascript
{
  status: "ok"
}
```

##### error
```javascript
{
  status: "unlogin"(登录过期)
}
 
{
  status: "error"(服务器错误/恶意操作)
}
```

# 2.User
##### 数据表
```concept
{
    userId;
    subId;//所属分站id
    nickname;
    avatar;
    studentCard;
    grade;
    major;
    password;
    type;
    phone;
    wechart;
    introduce;
    title;
    works;
    orderTimes;
    orderedTimes;
    score;
}
```
##### 添加用户
```javascript
request
{
  url: /api/user/add,
  method: post,
  content-type: application/json; charset=utf-8,
  data: User@object
}
 
response
{
  status: "ok",
  result: userId
}
```
##### 修改资料
```javascript
{
  url: /api/user/edit,
  method: post,
  content-type: application/json; charset=utf-8,
  data: User@object
}
```

##### 登录
```javascript
request
{
  url: /api/user/login,
  method: post,
  content-type: application/json; charset=utf-8,
  data: {
    nickname: ,
    password: base64加密后的密码
  }
}
 
response
{
  status: "ok"
}
 
{
  status: "error"(账号或密码错误)
}
```

##### 退出登录
```javascript
request
{
  url: /api/user/logout,
  method: get,
  content-type: application/json; charset=utf-8
}
```

##### 获取某用户基本信息
```javascript
request
{
  url: /api/user/info/{userId},
  method: get
}
 
response:User@object
```
##### 更新头像
```javascript
{
  url: /api/user/avatar/upload,
  method: post,
  data: {
    image:
  }
}

```



# 3.Skill
##### 数据表
```concept
{
    skillId;
    userId;
    subId;
    title;
    description;
    works;
    totleTime;
    totlePrice;
    tagId;
    score;
    orderTimes;
    orderedTimes;
}
```
##### 添加技能
```javascript
request
{
  url: /api/skill/add,
  method: post,
  content-type: application/json; charset=utf-8,
  data: Skill@object
}
 
response
{
  status: "ok",
  result: userId
}
```
##### 删除技能
```javascript
{
  url: /api/skill/delete/{skillId},
  method: get
}
```

##### 查看某用户技能列表
```javascript
request
{
  url: /api/skill/list/{userId}
  method: get
}
 
response:SKill@object[]
```

##### 查看某个技能详细信息
```javascript
request
{
  url: /api/skill/info/{skillId},
  method: get
}
response:SKill@object
```

##### 关键字搜索技能列表
```javascript
request
{
  url: /api/skill/search/keyword/{subId}/{keyword},
  method: get
}
 
response:SKill+User@object[]
```

##### 关键字搜索技能列表
```javascript
request
{
  url: /api/skill/search/tag/{subId}/{tagId},
  method: get
}
 
response:SKill+User@object[]
```


# 4.Order
##### 数据表
```concept
{
    orderId;
    fromUserId;
    toUserId;
    skillId;
    introduction;
    result;//0:待审核；1：同意；2：拒绝；3：已完成；4：取消；
    wechart;
    rejectReason;
    isCommented;//如果已完成，是否评论了0：否，1：是
}
```
##### 添加预约
```javascript
request
{
  url: /api/order/add,
  method: post,
  data: Order@object
}
 
response
{
  status: "ok",
  result: userId
}
```
##### (发起者)取消预约
```javascript
{
  url: /api/order/cancel/{orderId},
  method: get
}
```
##### (行家)拒绝预约
```javascript
{
  url: /api/order/reject/{orderId},
  method: get
}
```
##### 完成预约
```javascript
{
  url: /api/order/finish/{orderId},
  method: get
}
```
##### 删除预约
```javascript
{
  url: /api/order/delete/{orderId},
  method: get
}
```

##### 获取自己的预约列表
```javascript
request
{
  url: /api/order/list,
  method: get
}
 
response:Order@object[]
```
##### 查看某个预约详细信息
```javascript
request
{
  url: /api/order/info/{orderId},
  method: get
}
 
response:Order@object
```

# 5.Comment
##### 数据表
```concept
{
    commentId;
    userId;
    skillId;
    content;
    score;
}
```
##### 对某个技能进行评论
```javascript  
request
{
  url: /api/skill/comment/add,
  method: post,
  data: {
    skillId:,
    content:
  }
}
 
response
{
  status: "ok",
  result: userId
}
```
##### 查看某个技能的评论列表
```javascript
request
{
  url: /api/skill/comments/{skillId},
  method: get
}
 
response:Comment+User@object[](按时间递增排序)
```


# 6.Apply
##### 数据表
```concept
{
    applyId;
    userId;
    title;
    introduce;
    works;
    result;//0:审核中； 1：通过； 2：拒绝；
    rejectReason;
    wechart;
    
}
```

##### 申请行家认证
```javascript
request
{
  url: /api/apply/add,
  method: post,
  content-type: application/json; charset=utf-8,
  data: Apply@object
}
 
response
{
  status: "ok",
  result: userId
}
```

##### 查看自己最近一次的认证信息
```javascript
request
{
  url: /api/apply/latest,
  method: get
}
 
response:Apply@object
```

##### 查看自己的认证申请列表
```javascript
request
{
  url: /api/apply/list,
  method: get
}
 
response:Apply@object[]
```

##### 查看某个认证申请的详细信息
```javascript
request
{
  url: /api/apply/info/{applyId},
  method: get
}
 

response:Apply@object
```

# 7.Tag
