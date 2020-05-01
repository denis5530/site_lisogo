<#import "parts/common.ftl" as c>

<@c.page>


<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
    Добавить виртуального пользотеля
</a>
<div class="collapse" id="collapseExample">
    <div class="form-group mt-3">
        <form method="post" enctype="multipart/form-data">
            <div class="form-group">

                <div><input type="text" class="form-control" name="login" placeholder="Введите login" />
                 </div>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="password" placeholder="пароль">
            </div>

            <div class="form-group">
                <select class="form-control" name="smtp">
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
            <th>&nbsp&nbsp&nbsp&nbsp&nbspЛогин</th>
            <th>Пароль</th>
            <th>smtp</th>

            <th> </th>
        </tr>
        </thead>
        <tbody>
        <form method="post" enctype="multipart/form-data">
            <#list virtuausers as vs >
            <tr>


                <#if vs.username??>

                </#if>
                <td>${vs.username}</td>
                    <td>${vs.password}</td>
                <td>${vs.smtp}</td>

                <td><a class="btn btn-primary" href="?id=${vs.getId()}" role="button">Удалить</a>

                    <#else>

                    </#list>
            </tr>
        </form>
        </tbody>
    </table>
</div>


</@c.page>
