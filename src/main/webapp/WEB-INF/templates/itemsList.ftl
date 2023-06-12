<#include "main-template.ftl"/>

<@main title="Items List"/>

<#macro content>
    <ul>
        <#list itemsList as item>
            <li>${item.id}      ${item.name}       ${item.cost}       ${item.description}</li>
        </#list>
    </ul>

    <a href="/item/new">to create new item</a>
</#macro>