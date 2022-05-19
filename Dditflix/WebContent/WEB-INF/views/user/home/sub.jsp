<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../../common/header.jsp" />
    <link rel="stylesheet" href="../../resources/css/user/sub.css">
    <script>
        $(document).ready( function () {
            $('#myTable').DataTable({
                ordering: false,
                lengthChange: false
            });
        } );
    </script>
    <div class="main">
        <section>
            <div class="titleWrap mb-5">
                <h2 class="pageTitle pb-3">게시판</h2>
            </div>
            <table class="table" id="myTable">
                <thead>
                    <tr>
                        <th>영화</th>
                        <th>제목</th>
                        <th>글쓴이</th>
                        <th>날짜</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                    <tr>
                        <td>[영화이름입니다]</td>
                        <td>리뷰제목입니다.</td>
                        <td>userId</td>
                        <td>date</td>
                    </tr>
                </tbody>
            </table>
        </section>
    </div>
    <jsp:include page="../../common/footer.jsp" />
