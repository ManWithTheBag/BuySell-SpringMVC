<#include "main-template.ftl"/>

<@main title="New item"/>

<#macro content>

    <form action="/item/new" method="post">
        <input name="name" type="text" placeholder="Name">
        <input name="cost" type="number" step="0.1" min="0" placeholder="Cost">
        <input name="description" type="text" placeholder="Description">
        <input type="submit">
    </form>

</#macro>