<#import "/parts/common.ftlh" as c>
<#import "/parts/login.ftlh" as l>


<@c.page>

<div>
<@l.logout/>
</div>
<div>
    <form method="post">
        <input type="text" name="text" placeholder="Enter Message">
        <input type="text" name="tag" placeholder="Tag">
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <button type="submit">Enter</button>
    </form>
</div>

<div>List of messages</div>
<form method="get" action="/main">
    <input type="text" name="filter" value="${filter}">
    <button type="submit">Find</button>
</form>
<#list messages as message>
<div>
    <d>${message.id}</d>
    <span>${message.text}</span>
    <i>${message.tag}</i>
    <strong>${message.authorName}</strong>
</div>
<#else>
No messages
</#list>
</@c.page>