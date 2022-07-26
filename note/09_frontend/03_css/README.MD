# 选择器

## 常用选择器

|    名称    |        作用         |        语法        |          例子           |                          备注                          |
|:--------:|:-----------------:|:----------------:|:---------------------:|:----------------------------------------------------:|
|  元素选择器   |   根据标签名称选择指定元素    |    ${标签名} {}     |    `p {}`, `h1 {}`    |                     选择页面中所有的指定元素                     |
|  id选择器   |  根据标签的id值选择指定元素   |    #${id} {}     | `#box {}`, `#box1 {}` | 选择页面中的指定id值的元素(但是指定了多个标签都是相同的id的话他也会全部渲染,但是这种写法是错误的) |
| class选择器 | 根据标签的class值选择指定元素 | .${className} {} | `.box {}`, `.box1 {}` |                  选择页面中的指定`class`元素                   |
|  通配选择器   |    选中页面中的所有元素     |       * {}       |        `* {}`         |                      选择页面中的所有元素                      |


## 复合选择器

|      名称      |       作用       |            语法            |        例子        |                            备注                            |
|:------------:|:--------------:|:------------------------:|:----------------:|:--------------------------------------------------------:|
|    交集选择器     | 选中同事符合多个条件的元素  |   ${选择器1}...${标签名n} {}   |    `p.box1{}`    | 选择页面中p标签下面`class`值为`box1`的元素, 交集选择器中如果有元素选择器则必须使用元素选择器开头 |
| 分组选择器(并集选择器) | 同事选择多个选择器对应的元素 | ${选择器1}, ..., ${标签名n} {} | `p, .box1{}, h1` |               每个选择器之间使用`,`分割，用来选择符合任意条件的标签               |

## 关系选择器

|  名称   |       作用        |           语法           |      例子       |                       备注                       |
|:-----:|:---------------:|:----------------------:|:-------------:|:----------------------------------------------:|
| 后代选择器 | 选中指定元素内的指定后代元素  | ${父元素选择器} ${子元素选择器} {} |  `.box1 p{}`  |  选择页面中`class`值为`box1`的子元素为`p标签`的元素, 注意使用`空格`   |
| 兄弟选择器 | 选中指定元素的下一个兄弟元素  | ${元素选择器} + ${元素选择器} {} | `.box1 + p{}` | 选择页面中`class`值为`box1`的下一个兄弟元素为`p标签`的元素, 注意使用`+` |
| 兄弟选择器 | 选中指定元素的下面所有兄弟元素 | ${元素选择器} ~ ${元素选择器} {} | `.box1 ~ p{}` | 选择页面中`class`值为`box1`的下兄弟元素为`p标签`的所有元素, 注意使用`~` |

## 属性选择器

|     名称      |           作用           |          语法           |         例子          |                备注                 |
|:-----------:|:----------------------:|:---------------------:|:-------------------:|:---------------------------------:|
|    属性选择器    |      选择含有指定属性的元素       |      [${属性名}] {}      |    `p[title]{}`     |       选择页面中p标签属性为`title`的元素       |
|  属性=属性值选择器  |    选择含有指定属性及属性值的元素     | [${属性名}=${value}] {}  | `p[title=ggboy]{}`  |  选择页面中p标签属性为`title`且值为`ggboy`的元素  |
| 属性=属性值开头选择器 | 选择含有指定属性及属性值以指定数据开头的元素 | [${属性名}=^${value}] {} | `p[title=^ggboy]{}` | 选择页面中p标签属性为`title`且值为`ggboy`开头的元素 |
| 属性=属性值结尾选择器 | 选择含有指定属性及属性值以指定数据结尾的元素 | [${属性名}$={value}] {}  | `p[title$=ggboy]{}` | 选择页面中p标签属性为`title`且值为`ggboy`结尾的元素 |
| 属性=属性值包含选择器 | 选择含有指定属性及包含指定数据属性值的元素  | [${属性名}*={value}] {}  | `p[title*=ggboy]{}` | 选择页面中p标签属性为`title`且值包含`ggboy`的元素  |

## 伪类选择器

|        名称        |      作用       |            语法             |              例子               |                                       备注                                        |
|:----------------:|:-------------:|:-------------------------:|:-----------------------------:|:-------------------------------------------------------------------------------:|
|   元素最后一个子元素选择器   | 用来描述一个元素的特殊状态 |   ${选择器}:last-child {}    |       `p:last-child {}`       |                                 选择页面中p标签最后一个元素                                  |
|   元素第一个子元素选择器    | 用来描述一个元素的特殊状态 |   ${选择器}:first-child {}   |      `p:first-child {}`       |                                  选择页面中p标签第一个元素                                  |
|    元素指定元素选择器     | 用来描述一个元素的特殊状态 | ${选择器}:nth-child(term) {} |      `p:nth-child(1) {}`      | 选择页面中p标签第一个元素,参数为数字的时候则是选择第几个元素,当为n时选择所有,当为odd或者2n+1时选中奇数为的元素,当为2n或even时选中偶数位元素 |
|  link(仅作用于a标签)   |  选择没有被访问过的链接  |      ${选择器}:link {}       |     `.baiduLink:link {}`      |                   选择`class`为`baiduLink`的元素并且该元素没有被当前客户端点击访问过                    |
| visited(仅作用于a标签) |  选择有被访问过的链接   |     ${选择器}:visited {}     |    `.baiduLink:visited {}`    |                    选择`class`为`baiduLink`的元素并且该元素有被当前客户端点击访问过                    |
|      hover       |  用来表示鼠标移入的状态  |      ${选择器}:hover {}      |     `.baiduLink:hover {}`     |                     选择`class`为`baiduLink`的元素并且鼠标正在该元素上且是移入                      |
|      active      |  用来表示鼠标点击的状态  |     ${选择器}:active {}      |    `.baiduLink:active {}`     |                       选择`class`为`baiduLink`的元素并且鼠标正在点击该元素                       |
|     元素的第一个字母     |  获取元素的第一个字母   |  ${选择器}::first-letter {}  | `.baiduLink::first-letter {}` |                      选择`class`为`baiduLink`的元素并且是该元素的第一个字母                       |
|      元素的第一行      |   获取元素的第一行    |   ${选择器}::first-line {}   |  `.baiduLink::first-line {}`  |                       选择`class`为`baiduLink`的元素并且是该元素的第一行                        |
|      被选中的内容      |   获取被选中的内容    |   ${选择器}::selection {}    |  `.baiduLink::selection {}`   |                        选择`class`为`baiduLink`的元素并且是被选中的内容                        |
|      元素的开始       |    获取元素的开始    |     ${选择器}::before {}     |    `.baiduLink::before {}`    |                    选择`class`为`baiduLink`的元素并且是最开始的内容(无法被选中)                     |
|      元素的结尾       |    获取元素的结尾    |     ${选择器}::after {}      |    `.baiduLink::after {}`     |                     选择`class`为`baiduLink`的元素并且是最后的内容(无法被选中)                     |

# 样式关键字

## overflow

> 用于处理父元素如何处理溢出的子元素

- visible (默认值)

    允许溢出
- hidden

    溢出的内容将会被剪裁不会显示
- scroll

    溢出的内容将显示滚动条, 通过滚动条查看完整内容 (不管有没有溢出都会出现)
- auto
    
    自动处理溢出内容, 如果宽度没有溢出则不会有横向滚动条, 需要则会出现

## overflow

> 用于设置元素显示的类型

- inline 

  将元素设置为行内元素
- block

  将元素设置为块元素
- inline-block

  将元素设置为行内块元素
- table

  将元素设置为一个表格
- none

  将元素设置为不显示即为隐藏(等同不写这个标签一样)

## visibility

> 用于设置元素的显示状态

- visible(默认值)

  元素在页面中正常显示
- hidden

# 浮动

> 通过浮动可以使一个元素向其父元素的左侧或右侧移动
> 
>   使用float属性值可以设置元素的浮动
> 
>     none: 默认值，元素不浮动
>     left: 元素向左浮动
>     right: 元素向右浮动
> 注意: 元素设置浮动以后(float值不为none)水平布局的等式就不需要强制成立了。元素设置浮动以后，会完全从文档流中脱离，不在占用文档流的位置，所以元素下边的还在文档流中的元素会自动向上移动
> 
> 特点：
>   1. 浮动元素会完全脱离文档流，不在占用文档流中的位置
>   2. 设置浮动以后元素会像父元素的左侧或右侧移动
>   3. 浮动元素默认不会从父元素中移出
>   4. 浮动元素向左或向右浮动时不会超过它前边的其他浮动元素
>   5. 如果浮动元素的上边是一个没有浮动的块元素，则浮动元素无法上移
>   6. 浮动元素不会超过它上边的浮动的兄弟元素，最多就是和它一样高
>   7. 浮动元素不会盖住文字，文字会自动环绕在浮动元素的周围，所以我们可以利用浮动来设置文字环绕图片的效果