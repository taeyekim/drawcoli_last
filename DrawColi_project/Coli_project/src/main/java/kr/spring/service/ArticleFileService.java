package kr.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.spring.entity.Article;
import kr.spring.entity.ArticleFile;

@Service
public interface ArticleFileService {

   Long upload(Long articleId, String uploadPath, MultipartFile file);

}