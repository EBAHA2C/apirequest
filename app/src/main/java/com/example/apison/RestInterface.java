package com.example.apison;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


interface RestInterface {
    @Headers("patient:eyJpZCI6IjVmZDRjNzc2LWVkZDYtNGUzYi1iYmFmLTI5Y2NjZWZjNDVjMSIsIm1hc3RlclBhdGllbnRJZCI6Ijc2MzEyMjc1MTYiLCJmdWxsTmFtZSI6Ik1hcmlhIEhvZGtpZXdpY3oiLCJnaXZlbiI6Ik1hcmlhIiwiZmFtaWx5IjoiSG9ka2lld2ljeiIsIm5hdGlvbmFsSWQiOiI3NTIzMTM3NDE4NSIsInBhc3Nwb3J0TnVtYmVyIjoiNjc1LTc1OS00MDE5IiwiYmlydGhEYXRlIjoiMTk3Ni0xMS0yOFQwMDowMDowMFoiLCJnZW5kZXIiOiJPdGhlciIsInJlZGlzRXhwaXJhdGlvblRpbWUiOjkwMCwiZW1haWwiOiItIiwibmF0aW9uYWxpdHkiOiJKYW1haWNhIiwicGVyc29uVHlwZSI6IlRvdXJpc3QiLCJuYXRpb25hbEhlYWx0aE51bWJlciI6Ijc2MzEyMjc1MTYiLCJjb250YWN0IjpudWxsLCJhZGRyZXNzIjpbeyJsaW5lIjpudWxsLCJjaXR5IjoiTmV3IFJlYmVjYWJvcm91Z2giLCJzdGF0ZSI6bnVsbCwiY291bnRyeSI6IkJydW5laSBEYXJ1c3NhbGFtIiwiZGlzdHJpY3QiOiJNQSIsInBvc3RhbENvZGUiOm51bGwsImV4dGVuc2lvbiI6bnVsbH1dLCJ0ZWxlY29tIjoiNzY2LTIyNS02MzYyIiwiZ2VuZXJhbFByYWN0aXRpb25lciI6bnVsbH0=")
    @GET("/phr/encounter")
    Call<MultipleResource> getDatum();
}