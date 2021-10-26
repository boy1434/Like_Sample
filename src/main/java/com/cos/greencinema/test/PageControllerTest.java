package com.cos.greencinema.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageControllerTest {

	// 민수 영역-------------
	@GetMapping("test/movie/detail")
	public String movieDetail() {
		return "movie/detail";
	}

	@GetMapping("test/movie/list")
	public String movielist() {
		return "movie/list";
	}

	@GetMapping("test/user/myRes")
	public String userMyRes() {
		return "user/myRes";
	}

	// 상진 영역 ----------------

	@GetMapping("/likePage")
	public String likePage() {
		return "user/likePage";
	}

	@PostMapping("/like")
	public @ResponseBody CMRespDto<?> like() {

		// DB에 insert 하고 정상이면!!
		return new CMRespDto<>(1, "성공", null);
	}

	@GetMapping("test/user/joinForm")
	public String userjoinForm() {
		return "user/joinForm";
	}

	@GetMapping("test/user/loginForm")
	public String userloinForm() {
		return "user/loginForm";
	}

	@GetMapping("test/user/updateForm")
	public String userUpdateForm() {
		return "user/updateForm";
	}

	@GetMapping("test/layout/main")
	public String main() {
		// return "user/main";
		return "layout/main";
	}

	// 민홍 영역 --------------
	@GetMapping("test/res/Reserve")
	public String resReserve() {
		return "res/Reserve";
	}

	@GetMapping("test/pay/pay")
	public String pay() {
		return "pay/pay";
	}

	// 민환 영역 ------------------
	@GetMapping("test/admin/joinMovieForm")
	public String adminJoinMovieForm() {
		return "admin/joinMovieForm";
	}

	@GetMapping("test/admin/movieManage")
	public String adminMovieManage() {
		return "admin/movieManage";
	}

	@GetMapping("test/admin/resManage")
	public String adminresManage() {
		return "admin/resManage";
	}

}
