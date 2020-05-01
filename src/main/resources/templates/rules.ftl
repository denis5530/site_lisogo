<#import "parts/common.ftl" as c>

<@c.page>


<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
    Добавить правило
</a>
<div class="collapse" id="collapseExample">
    <div class="form-group mt-3">
        <form method="post" enctype="multipart/form-data">
            <div class="form-group">

                <div><input type="text" class="form-control" name="from" placeholder="От кого письмо" />
                    </div>
            </div>

            <div class="form-group">
                Внутренний получатель
                <select class="form-control" name="to" >
                    <option>-</option>
                    <#list virtList as vr >
                        <#if vr.getId()??>
                        </#if>
                        <option>${vr.username}</option>
                    <#else>

                    </#list>
                </select>
            </div>


            <div class="form-group">
                Внешний ящик
                <select class="form-control" name="in"  placeholder="Внешний ящик" >
                    <option>-</option>
                    <#list smtpList as smtp >
                        <#if smtp.getId()??>
                        </#if>
                        <option>${smtp.login}</option>
                    <#else>

                    </#list>
                </select>
            </div>


            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group">
                <button type="submit" class="btn btn-primary" value="add">Добавить</button>
            </div>
        </form>
    </div>
</div>
<p></p>
</div>
<div>
    <table class="table" align="centre">
        <thead>
        <tr>
            <th>От кого письмо</th>
            <th>Внутренний получатель</th>
            <th>Внешний ящик</th>
            <th> </th>
        </tr>
        </thead>
        <tbody>
        <form method="post" enctype="multipart/form-data">

            <tr>
                <#list rule as rl >
                    <#if rl.getId()??>
                    </#if>



                <td>${rl.froms}</td>
                    <td>${rl.tos}</td>
                <td>${rl.login}</td>

                <td>

                    <a class="btn btn-primary" href="?id=${rl.id}" role="button">Удалить</a>


            </tr>
            <#else>

            </#list>
        </form>
        </tbody>
    </table>
</div>


</@c.page>
