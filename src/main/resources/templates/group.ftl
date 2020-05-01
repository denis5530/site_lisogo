<#import "parts/common.ftl" as c>

<@c.page>


<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
    Добавить ящик
</a>
<div class="collapse" id="collapseExample">
    <div class="form-group mt-3">
        <form method="post" enctype="multipart/form-data">
            <div class="form-group">

                <div><input type="text" class="form-control" name="name" placeholder="Введите имя группы" /></div>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="listemail" placeholder="Введите email адреса через ;">
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
            <th>&nbsp&nbsp&nbsp&nbsp&nbspИмя</th>
            <th>email</th>
        </tr>
        </thead>
        <tbody>
        <form method="post" enctype="multipart/form-data">

            </tr>
        </form>
        </tbody>
    </table>
</div>


</@c.page>
