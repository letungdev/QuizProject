USE [master]
GO
/****** Object:  Database [QLTTNSON]    Script Date: 28/10/2017 5:41:47 CH ******/
CREATE DATABASE [QLTTNSON]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLTTNSON', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\QLTTNSON.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QLTTNSON_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\QLTTNSON_log.ldf' , SIZE = 2624KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QLTTNSON] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLTTNSON].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLTTNSON] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLTTNSON] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLTTNSON] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLTTNSON] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLTTNSON] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLTTNSON] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QLTTNSON] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [QLTTNSON] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLTTNSON] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLTTNSON] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLTTNSON] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLTTNSON] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLTTNSON] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLTTNSON] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLTTNSON] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLTTNSON] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLTTNSON] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLTTNSON] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLTTNSON] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLTTNSON] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLTTNSON] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLTTNSON] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLTTNSON] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLTTNSON] SET RECOVERY FULL 
GO
ALTER DATABASE [QLTTNSON] SET  MULTI_USER 
GO
ALTER DATABASE [QLTTNSON] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLTTNSON] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLTTNSON] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLTTNSON] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [QLTTNSON]
GO
/****** Object:  StoredProcedure [dbo].[getUserByUserID]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[getUserByUserID]
@matk int
as begin
select*from TaiKhoan
where matk =@matk
end



GO
/****** Object:  StoredProcedure [dbo].[getUserByUserName]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[getUserByUserName]
@username nvarchar(20)
as begin
select*from TaiKhoan
where username=@username
end


GO
/****** Object:  StoredProcedure [dbo].[ups_deleteClass_pj]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_deleteClass_pj]
@malophoc varchar(10)
as begin
update LopHoc
set trangthai=0
where malophoc=@malophoc
end



GO
/****** Object:  StoredProcedure [dbo].[ups_deleteQuestion]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_deleteQuestion]
@macauhoi int
						
as begin
update CauHoi 
set trangthai=0 
where
macauhoi= @macauhoi
end


GO
/****** Object:  StoredProcedure [dbo].[ups_deleteSubject]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_deleteSubject]
@mamonhoc varchar(10)
as begin
update MonHoc
set trangthai=0
where mamonhoc=@mamonhoc
end


GO
/****** Object:  StoredProcedure [dbo].[ups_deleteUser]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_deleteUser]
						@matk int
						
as begin
update TaiKhoan 
set trangthai=0 
where
matk= @matk
end


GO
/****** Object:  StoredProcedure [dbo].[ups_getAllClass_pj]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_getAllClass_pj]
as begin
select  malophoc,tenlop
from LopHoc
where trangthai=1
end
GO
/****** Object:  StoredProcedure [dbo].[ups_getAllCTDethi]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_getAllCTDethi]
as begin
select *from CTDeThi
order by madethi asc
end



GO
/****** Object:  StoredProcedure [dbo].[ups_getAllDethi]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_getAllDethi]
as begin
select *from DeThi
order by madethi asc
end


GO
/****** Object:  StoredProcedure [dbo].[ups_getAllQuestion]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_getAllQuestion]
as begin
select*from CauHoi
where trangthai=1
order by macauhoi desc
end



GO
/****** Object:  StoredProcedure [dbo].[ups_getALLQuiz]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
 create proc [dbo].[ups_getALLQuiz]
 as begin
 select *from DeThi
 where trangthai=1
 end


GO
/****** Object:  StoredProcedure [dbo].[ups_getAllSubject]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_getAllSubject]
as begin
select*from MonHoc
where trangthai=1
order by mamonhoc desc
end 


GO
/****** Object:  StoredProcedure [dbo].[ups_getAllThamGia]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_getAllThamGia]
as begin
select TaiKhoan.hoten,TaiKhoan.matk,MonHoc.tenmonhoc
from Thamgia
join TaiKhoan
on Thamgia.matk=TaiKhoan.matk
join MonHoc
on Thamgia.mamonhoc=MonHoc.mamonhoc
order by Thamgia.matk
end
GO
/****** Object:  StoredProcedure [dbo].[ups_getAllUser]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_getAllUser]
as
begin
select * from TaiKhoan 
where trangthai=1
order by matk desc
end


GO
/****** Object:  StoredProcedure [dbo].[ups_getAllUserLopKhoa]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_getAllUserLopKhoa]
as begin
select 
TaiKhoan.matk,TaiKhoan.hoten,TaiKhoan.ngaysinh,TaiKhoan.diachi,TaiKhoan.namhoc,TaiKhoan.sdt,
TaiKhoan.email,TaiKhoan.username,TaiKhoan.pass,LopHoc.tenlop,TaiKhoan.quyen
from TaiKhoan
join LopHoc
on TaiKhoan.malophoc=LopHoc.malophoc
where TaiKhoan.trangthai=1
end
GO
/****** Object:  StoredProcedure [dbo].[ups_getClassbyClassID]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_getClassbyClassID]
@malophoc varchar(10)
as begin
select*from LopHoc where 
malophoc=@malophoc
end


GO
/****** Object:  StoredProcedure [dbo].[ups_getPermission]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_getPermission]
as begin
select quyen
from TaiKhoan
group by quyen
end
GO
/****** Object:  StoredProcedure [dbo].[ups_getQuizListBymadethi]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_getQuizListBymadethi]

@madethi int
as begin
select 
CauHoi.macauhoi, CauHoi.ndcauhoi, CauHoi.phuonganA,CauHoi.phuonganB,CauHoi.phuonganC,CauHoi.phuonganD,CauHoi.dapan,
DeThi.tongdiem,
CTDeThi.madethi ,
DeThi.thoigianthi
from  CTDeThi
join CauHoi
on CTDeThi.macauhoi=CauHoi.macauhoi
join DeThi
on DeThi.madethi=CTDeThi.madethi
where CTDeThi.madethi=@madethi
end

GO
/****** Object:  StoredProcedure [dbo].[ups_getRandomQuizIDBySubjectID]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_getRandomQuizIDBySubjectID]
@mamonhoc varchar(10)
as begin
SELECT TOP 1 madethi  FROM DeThi
where mamonhoc=@mamonhoc
ORDER BY NEWID()
end


GO
/****** Object:  StoredProcedure [dbo].[ups_getSubjectByID]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_getSubjectByID]
@mamonhoc varchar(10)
as begin
select*from MonHoc where mamonhoc=@mamonhoc
end


GO
/****** Object:  StoredProcedure [dbo].[ups_getUserByUsername]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_getUserByUsername]
@username varchar(20)
as begin
select*from TaiKhoan where username=@username
end


GO
/****** Object:  StoredProcedure [dbo].[ups_inserDethi]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[ups_inserDethi]
@madethi int,
@macauhoi int
as begin
insert into CTDeThi( madethi, macauhoi) 
values (@madethi,@macauhoi)
end



GO
/****** Object:  StoredProcedure [dbo].[ups_insertClass_pj]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_insertClass_pj]
@malophoc varchar (10),
@tenlop nvarchar (50)
as begin
insert into LopHoc (malophoc,tenlop)
values (@malophoc,@tenlop)
end
GO
/****** Object:  StoredProcedure [dbo].[ups_insertQuestion]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_insertQuestion]			
						@ndcauhoi nvarchar(1000),
						@dokho int,
						@mamonhoc varchar(10),
						@phuonganA nvarchar(1000),
						@phuonganB nvarchar(1000),
						@phuonganC nvarchar(1000),
						@phuonganD nvarchar(1000),
						@dapan char(1),
						@matk int

as begin
insert into CauHoi( ndcauhoi,dokho,mamonhoc,phuonganA,phuonganB,phuonganC,phuonganD,dapan,matk)
values (@ndcauhoi,@dokho,@mamonhoc,@phuonganA,@phuonganB,@phuonganC,@phuonganD,@dapan,@matk)
end


GO
/****** Object:  StoredProcedure [dbo].[ups_insertResult]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_insertResult]
@matk int,
@tongdiem float,
@madethi int,
@ngayThi date
as begin
insert into KetQua (matk,madethi,tongdiem,ngaythi)
values(@matk,@madethi,@tongdiem,@ngayThi)
end
GO
/****** Object:  StoredProcedure [dbo].[ups_insertSubject]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_insertSubject]
	@mamonhoc varchar(10),
	@tenmonoc nvarchar(10),
	@sotinchi int
as begin
insert into MonHoc(mamonhoc,tenmonhoc,sotinchi)
values(@mamonhoc,@tenmonoc,@sotinchi)
end


GO
/****** Object:  StoredProcedure [dbo].[ups_insertUser]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_insertUser]
						@hoten nvarchar(50),
						@ngaysinh date ,
						@diachi nvarchar(50),
						@namhoc int,
						@sdt varchar(11),
						@email nvarchar(50),
						@username nvarchar (20),
						@pass nvarchar(20),
						@malophoc varchar (10),
						@quyen nchar(10)
as begin
insert into TaiKhoan ( hoten,ngaysinh,diachi,namhoc,sdt,email,username,pass,malophoc,quyen)
values (@hoten,@ngaysinh,@diachi,@namhoc,@sdt,@email,@username,@pass,@malophoc,@quyen)
end

GO
/****** Object:  StoredProcedure [dbo].[ups_login]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[ups_login]
@username nvarchar(20),
@pass nvarchar (20)

as
begin
select *from TaiKhoan
where username= @username and pass=@pass 
end


GO
/****** Object:  StoredProcedure [dbo].[ups_updateClass_pj]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_updateClass_pj]
@malophoc varchar(10),
@tenlop nvarchar(50)
as begin
update LopHoc
set tenlop=@tenlop,malophoc=@malophoc
where malophoc=@malophoc
end

GO
/****** Object:  StoredProcedure [dbo].[ups_updateQuestion]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_updateQuestion]
						@macauhoi int,
						@ndcauhoi nvarchar(1000),
						@dokho int,
						@mamonhoc varchar(10),
						@phuonganA nvarchar(1000),
						@phuonganB nvarchar(1000),
						@phuonganC nvarchar(1000),
						@phuonganD nvarchar(1000),
						@dapan char(1)
					
as begin
update CauHoi
set ndcauhoi=@ndcauhoi,dokho=@dokho,mamonhoc=@mamonhoc,phuonganA=@phuonganA,phuonganB=@phuonganB,phuonganC=@phuonganC,phuonganD=@phuonganD,
dapan=@dapan
where 
macauhoi=@macauhoi
end


GO
/****** Object:  StoredProcedure [dbo].[ups_updateSubject]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_updateSubject]
@mamonhoc varchar (10),
@tenmonhoc nvarchar(10),
@sotinchi int 
as begin
update MonHoc
set mamonhoc=@mamonhoc, tenmonhoc=@tenmonhoc,sotinchi=@sotinchi
where mamonhoc=@mamonhoc
end 

GO
/****** Object:  StoredProcedure [dbo].[ups_updateUser]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[ups_updateUser]
						@matk int,
						@hoten nvarchar(50),
						@ngaysinh date ,
						@diachi nvarchar(50),
						@namhoc int,
						@sdt varchar(11),
						@email nvarchar(50),
						@username nvarchar (20),
						@pass nvarchar(20),
						@malophoc varchar (10),
						@quyen nchar(10)
as begin
update TaiKhoan
set hoten=@hoten, ngaysinh=@ngaysinh,diachi=@diachi,namhoc=@namhoc,sdt=@sdt,email=@email,username=@username,pass=@pass,
	malophoc=@malophoc,quyen=@quyen
	where matk=@matk
end

GO
/****** Object:  Table [dbo].[CauHoi]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CauHoi](
	[macauhoi] [int] IDENTITY(1,1) NOT NULL,
	[ndcauhoi] [nvarchar](1000) NULL,
	[dokho] [int] NULL,
	[mamonhoc] [varchar](10) NOT NULL,
	[phuonganA] [nvarchar](1000) NULL,
	[phuonganB] [nvarchar](1000) NULL,
	[phuonganC] [nvarchar](1000) NULL,
	[phuonganD] [nvarchar](100) NULL,
	[dapan] [char](1) NULL,
	[matk] [int] NOT NULL,
	[trangthai] [int] NOT NULL,
 CONSTRAINT [PK__CauHoi__95E62F03110BE137] PRIMARY KEY CLUSTERED 
(
	[macauhoi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[CTDeThi]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTDeThi](
	[macauhoi] [int] NOT NULL,
	[madethi] [int] NOT NULL,
 CONSTRAINT [PK_CTDeThi] PRIMARY KEY CLUSTERED 
(
	[macauhoi] ASC,
	[madethi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[DeThi]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[DeThi](
	[madethi] [int] IDENTITY(1,1) NOT NULL,
	[mamonhoc] [varchar](10) NOT NULL,
	[socaudokho1] [int] NULL,
	[socaudokho2] [int] NULL,
	[socaudokho3] [int] NULL,
	[trangthai] [int] NULL,
	[dsmacauhoi] [nvarchar](600) NULL,
	[time] [time](7) NULL,
	[tongdiem] [decimal](10, 0) NULL,
	[dsradom] [nvarchar](1000) NULL,
	[thoigianthi] [int] NULL,
 CONSTRAINT [PK__DeThi__F2D973E0C457E36D] PRIMARY KEY CLUSTERED 
(
	[madethi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[KetQua]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KetQua](
	[makq] [int] IDENTITY(1,1) NOT NULL,
	[tongdiem] [float] NULL,
	[matk] [int] NOT NULL,
	[madethi] [int] NOT NULL,
	[ngaythi] [datetime] NULL,
 CONSTRAINT [PK__KetQua__7A21BB439AE9154C] PRIMARY KEY CLUSTERED 
(
	[makq] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LopHoc]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[LopHoc](
	[malophoc] [varchar](10) NOT NULL,
	[tenlop] [nvarchar](50) NULL,
	[trangthai] [int] NULL,
 CONSTRAINT [PK__LopHoc__652FFDDDA21584D1] PRIMARY KEY CLUSTERED 
(
	[malophoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MonHoc]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[MonHoc](
	[mamonhoc] [varchar](10) NOT NULL,
	[tenmonhoc] [nvarchar](10) NULL,
	[sotinchi] [int] NULL,
	[trangthai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[mamonhoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[matk] [int] IDENTITY(1,1) NOT NULL,
	[hoten] [nvarchar](50) NULL,
	[ngaysinh] [datetime] NULL,
	[diachi] [nvarchar](50) NULL,
	[namhoc] [int] NULL,
	[sdt] [varchar](11) NULL,
	[email] [nvarchar](50) NULL,
	[username] [nvarchar](20) NOT NULL,
	[pass] [nvarchar](20) NOT NULL,
	[malophoc] [varchar](10) NULL,
	[quyen] [nchar](10) NOT NULL,
	[trangthai] [int] NULL,
 CONSTRAINT [PK__TaiKhoan__7A217E16F25F7706] PRIMARY KEY CLUSTERED 
(
	[matk] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Thamgia]    Script Date: 28/10/2017 5:41:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Thamgia](
	[matk] [int] NOT NULL,
	[mamonhoc] [varchar](10) NOT NULL,
 CONSTRAINT [PK_Thamgia] PRIMARY KEY CLUSTERED 
(
	[matk] ASC,
	[mamonhoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[CauHoi] ON 

INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1, N'8+9 =10', 1, N'T', N'=16', N'=15', N'=14', N'=19', N'A', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (2, N'9-8=?', 1, N'T', N'=2', N'=3', N'=4', N'=1', N'D', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (3, N'2^2+3^2=?
', 1, N'T', N'=11', N'=12', N'=13', N'=14', N'C', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (4, N'√16 =? ', 2, N'T', N'=3', N'=4', N'=5', N'=6', N'B', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1002, N'Cho tam giác ABC. Kéo dài cạnh BC về phía B một đoạn BB/ bằng CB, kéo dài cạnh BA về phía A một đoạn AA/ bằng BA, kéo dài cạnh AC về phía C một đoạn CC/ bằng AC. Nối A/B/; B/C/; C/A/. Diện tích tam giác A/B/C/ so với diện tích tam giác ABC thì gấp:', 3, N'T', N'6 lần', N'7 lần', N'8 lần', N'9 lần', N'B', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1003, N'Cho dãy số: 1; 4; 9; 16; 25; ...; ...; ...;
	3 số cần viết tiếp vào dãy số trên là:
', 3, N'T', N'36, 49, 64	B. 36, 48, 63', N'49, 64, 79', N'35, 49, 64', N'35, 49, 64', N'B', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1004, N'Trong hộp có 40 viên bi, trong đó có 24 viên bi xanh. Tỉ số phần trăm của số bi xanh và số bi trong hộp là bao nhiêu?', 3, N'T', N'20%', N'40%', N'80%', N'60%', N'C', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1005, N'5840g bằng bao nhiêu kg?', 2, N'T', N'58,4kg', N'5,84kg', N'0,584kg', N'0,0584kg', N'D', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1006, N'Có 10 người bước vào phòng họp. Tất cả đều bất tay lẫn nhau. Số cái bắt tay sẽ là:', 2, N'T', N'45	', N'90', N'54', N'89', N'D', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1007, N'Trung bình cộng của 3 số tự nhiên liên tiếp là 2. Đó là ba số nào?', 2, N'T', N'1; 2; 3', N'2; 3; 4', N'4; 5; 6', N'0; 1; 2', N'C', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1008, N'3-1=?', 1, N'T', N'2', N'4', N'1', N'5', N'2', 1, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1009, N' PHP files have a default file extension of..', 1, N'PHP', N'.html', N'.xml', N'.php', N'.ph', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1010, N' A PHP script should start with ___ and end with ___:', 1, N'PHP', N' < php >', N'< ? php ?>', N'<! ?>', N' <?php ?>', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1011, N' Which of the following is/are a PHP code editor?', 1, N'PHP', N'Notepad', N'Notepad++', N'Adobe Dreamweaver', N'All of the mentioned', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1012, N'Which of the following must not be installed on your computer so as to run PHP script?', 1, N'PHP', N'Adobe Dreamweaver', N'PHP', N'Apache', N' IIS', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1013, N'Which version of PHP introduced Try/catch Exception?', 1, N'PHP', N'PHP 4', N'PHP 5', N'PHP 5.3', N'PHP 6', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1014, N' We can not use ___ to comment a single line?', 1, N'PHP', N'/?', N' //', N'#', N'/* */', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1015, N'Which of the following php statement/statements will store 111 in variable num?', 1, N'PHP', N'int $num = 111;', N'int mum = 111;', N'$num = 111;', N'111 = $num;', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1016, N' The filesize() function returns the file size in ___.', 1, N'PHP', N'bits', N'bytes', N'kilobytes', N'gigabytes', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1017, N'Which one of the following PHP function is used to determine a file’s last access time?', 1, N'PHP', N'fileltime()', N'filectime()', N' fileatime()', N'filetime()', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1018, N' Which one of the following function is capable of reading a file into an array?', 1, N'PHP', N' file()', N'arrfile()', N' arr_file()', N' file_arr()', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1019, N'Which one of the following function is capable of reading a file into a string variable?', 1, N'PHP', N'file_contents()', N'file_get_contents()', N' file_content()', N'file_get_content()', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1020, N' Which one of the following function is capable of reading a specific number of characters form a file?', 1, N'PHP', N' fgets()', N'fget()', N'fileget()', N'filegets()', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1021, N'Which one of the following function operates similarly to fgets(), except that it also strips any HTML and PHP tags form the input?', 1, N'PHP', N' fgetsh()', N'fgetsp()', N'fgetsa()', N'fgetss()', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1022, N'Which one of the following function outputs the contents of a string variable to the specified resource?', 1, N'PHP', N'filewrite()', N'fwrite()', N'filewrites()', N'fwrites()', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1023, N'Which function sets the file filename’s last-modified and last-accessed times?', 1, N'PHP', N'sets()', N'set()', N'touch()', N'touched()', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1024, N'Which function is useful when you want to output the executed command’s result?', 1, N'PHP', N'out_cmm()', N'out_system()', N'cmm()', N'system()', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1025, N'Which one of the following function reads a directory into an Array?', 1, N'PHP', N'scandir()', N' readdir()', N'scandirectory()', N'readdirectory()', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1026, N'The practice of separating the user from the true inner workings of an application through well-known interfaces is known as..', 1, N'PHP', N'Polymorphism', N'Inheritance', N'Encapsulation', N'Abstraction', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1027, N'Which of the following term originates from the Greek language that means “having multiple forms,” defines OOP’s ability to redefine, a class’s characteristics?', 1, N'PHP', N'Abstraction', N'Polymorphism', N'Inheritance', N'Differential', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1028, N'The practice of creating objects based on predefined classes is often referred to as..', 1, N'PHP', N' class creation', N' object creation', N'object instantiation', N'class instantiation', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1029, N' Which one of the following property scopes is not supported by PHP?', 1, N'PHP', N'friendly', N'final', N'public', N'static', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1030, N'Which one of the following can be used to instantiate an object in PHP assuming class name to be Foo?', 1, N'PHP', N'$obj = new $foo;', N'$obj = new foo;', N'$obj = new foo ();', N'obj = new foo ();', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1031, N'Which one of the following is the right way to define a constant?', 1, N'PHP', N'constant PI = “3.1415”;', N'const $PI = “3.1415”;', N'constant PI = ‘3.1415’;', N'const PI = ‘3.1415’;', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1032, N'Which one of the following is the right way to call a class constant, given that the class is mathFunction?', 1, N'PHP', N'echo PI;', N'echo mathFunction->PI;', N'echo mathFunction::PI;', N' echo mathFunction=PI;', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1033, N'Which one of the following is the right way to invoke a method?', 1, N'PHP', N'$object->methodName();', N'object->methodName();', N'object::methodName();', N'$object::methodName();A', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1034, N'Which of the following is/are the right way to declare a method?', 2, N'PHP', N'function functionName() { function body }', N'scope function functionName() { function body }', N'method methodName() { method body }', N'A and B Correctly', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1035, N'Which of the following method scopes is/are not supported by PHP?', 2, N'PHP', N'private', N'final', N'static', N'None of the mentioned', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1036, N'Which one of the following is the very first task executed by a session enabled page?', 2, N'PHP', N'Delete the previous session', N'Start a new session', N'Check whether a valid session exists', N'Handle the session', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1037, N' How many ways can a session data be stored?', 2, N'PHP', N'3', N'4', N'5', N'6', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1038, N'Which directive determines how the session information will be stored?', 2, N'PHP', N'save_data', N'session.save', N'session.save_data', N'session.save_handler', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1039, N' Which one of the following is the default PHP session name?', 2, N'PHP', N'PHPSESSID', N'PHPSESID', N'PHPSESSIONID', N'PHPIDSESS', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1040, N' If session.use_cookie is set to 0, this results in use of..', 2, N'PHP', N'Session', N'Cookie', N'URL rewriting', N'Nothing happens', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1041, N'If the directive session.cookie_lifetime is set to 3600, the cookie will live until..', 2, N'PHP', N'3600 sec', N'3600 min', N'3600 hrs', N'the browser is restarted', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1042, N' Neglecting to set which of the following cookie will result in the cookie’s domain being set to the host name of the server which generated it.', 2, N'PHP', N'session.domain', N'session.path', N'session.cookie_path', N'session.cookie_domain', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1043, N'What is the default number of seconds that cached session pages are made available before the new pages are created?', 3, N'PHP', N'360', N'180', N'3600', N'1800', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1044, N'What is the default time(in seconds) for which session data is considered valid?', 3, N'PHP', N'1800', N'3600', N'1440', N'1540', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1045, N'Which one of the following function is used to start a session?', 3, N'PHP', N'tart_session()', N'session_start()', N'session_begin()', N'begin_session()', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1046, N' Which of the below symbols is a newline character?', 3, N'PHP', N' \r', N'\n', N' /n', N'/r', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1047, N'Which one of the following databases has PHP supported almost since the beginning?', 3, N'PHP', N'Oracle Database', N'SQL', N'SQL+', N'MySQL', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1048, N'The updated MySQL extension released with PHP 5 is typically referred to as..', 3, N'PHP', N'MySQL', N'mysql', N'mysqli', N'mysqly', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1049, N' Which one of the following lines need to be uncommented or added in the php.ini file so as to enable mysqli extension?', 3, N'PHP', N'extension=php_mysqli.dll', N'extension=mysql.dll', N'extension=php_mysqli.dl', N' extension=mysqli.dl', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1050, N' In which version of PHP was MySQL Native Driver(also known as mysqlnd) introduced?', 3, N'PHP', N'PHP 5.0', N'PHP 5.1', N'PHP 5.2', N'PHP 5.3', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1051, N' Which one of the following statements is used to create a table?', 3, N'PHP', N'CREATE TABLE table_name (column_name column_type);', N'CREATE table_name (column_type column_name);', N'CREATE table_name (column_name column_type);', N' CREATE TABLE table_name (column_type column_name);', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1052, N'Which one of the following statements instantiates the mysqli class?', 3, N'PHP', N'mysqli = new mysqli()', N'$mysqli = new mysqli()', N'$mysqli->new.mysqli()', N'mysqli->new.mysqli()', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1053, N'Which one of the following statements can be used to select the database?', 3, N'PHP', N'$mysqli=select_db(‘databasename’);', N'mysqli=select_db(‘databasename’);', N'mysqli->select_db(‘databasename’);', N'$mysqli->select_db(‘databasename’);', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1054, N'Which one of the following methods can be used to diagnose and display information about a MySQL connection error?', 3, N'PHP', N'connect_errno()', N'connect_error()', N'mysqli_connect_errno()', N'mysqli_connect_error()', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1055, N'Which method returns the error code generated from the execution of the last MySQL function?', 3, N'PHP', N'errno()', N' errnumber()', N' errorno()', N'errornumber()', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1056, N' If there is no error, then what will the error() method return?', 3, N'PHP', N'true', N'false', N'Empty', N'0', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1057, N'The date() function returns ___ representation of the current date and/or time.', 3, N'PHP', N'Integer', N'String', N'Boolean', N'Float', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1058, N' In which format does JavaScript support external JavaScript?', 1, N'JVSCR', N'.js', N' .php', N'.js/php', N' .jss', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1059, N' What are the two parts of JavaScript libraries?', 1, N'JVSCR', N' “script” tag and “body” tag', N' External JavaScript and the “script” tag', N'“html” tag and “body” tag', N'None of the mentioned', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1060, N'Which of the following is possible to be referenced in external JavaScript?', 1, N'JVSCR', N'cpp', N'cs', N'php', N' All of the mentioned', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1061, N' Which of the following attribute takes the source of the PHP file?', 1, N'JVSCR', N'img', N'src', N'source', N' None of the mentioned', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1062, N'What kind of path can the PHP file be?', 1, N'JVSCR', N'Absolute', N'Relative', N' Either a or b', N'Both a and b', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1063, N'What is the purpose of the RegExp method test()?', 1, N'JVSCR', N'Tests for a match in its float parameter.', N'Tests for a match in its string parameter.', N'Tests for a match in its integer parameter.', N'None of the mentioned', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1064, N'What is the purpose of the function parameter filetype?', 1, N'JVSCR', N' File type to be expected', N'File type previously got', N'File type that should not be got', N'None of the mentioned', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1065, N'Which of the following is the method used to add an element to the desired location?', 1, N'JVSCR', N'add.element()', N'element.add()', N' element.appendChild()', N' None of the mentioned', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1066, N'JavaScript Code can be called by using', 1, N'JVSCR', N' RMI', N'Triggering Event', N'Preprocessor', N'Function/Method', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1067, N'The type of a variable that is volatile is', 1, N'JVSCR', N' Volatile variable', N' Mutable variable', N'Immutable variable', N'Dynamic variable', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1068, N' A hexadecimal literal begins with', 1, N'JVSCR', N'0', N'0x', N'0X', N'Both b and c', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1069, N' The generalised syntax for a real number representation is', 1, N'JVSCR', N' [digits][.digits][(E|e)[(+|-)]digits]', N' [digits][+digits][(E|e)[(+|-)]digits]', N'[digits][(E|e)[(+|-)]digits] ', N' [.digits][digits][(E|e)[(+|-)]digits]', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1070, N'When there is an indefinite or an infinity value during an arithmetic value computation, javascript', 1, N'JVSCR', N' Prints an exception error', N'Prints an overflow error', N'Displays “Infinity”', N'Prints the value as such', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1071, N' Which of the following is not considered as an error in JavaScript?', 1, N'JVSCR', N' Syntax error', N' Missing of semicolons', N' Division by zero', N' All of the above', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1072, N' The escape sequence ‘\f’ stands for', 1, N'JVSCR', N'Floating numbers', N'Representation of functions that returns a value', N' \f is not present in JavaScript', N' Form feed', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1073, N'The snippet that has to be used to check if “a” is not equal to “null” is', 1, N'JVSCR', N' if(a!=null)', N'if (!a)', N' if(a!null)', N'if(a!==null)', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1074, N' The statement a===b refers to', 1, N'JVSCR', N'Both a and b are equal in value, type and reference address', N'Both a and b are equal in value', N'Both a and b are equal in value and type', N'There is no such statement', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1075, N'Assume that we have to convert “false” that is a non-string to string. The command that we use is (without invoking the “new” operator)', 1, N'JVSCR', N'false.toString()', N'String(false)', N'String newvariable=”false”', N'Both a and b', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1076, N' A function definition expression can be called', 1, N'JVSCR', N'Function prototype', N'Function literal', N'Function definition', N' Function declaration', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1077, N'The property of a primary expression is', 1, N'JVSCR', N'stand-alone expressions', N' basic expressions containing all necessary functions', N'contains variable references alone', N'complex expressions', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1078, N'The JavaScript’s syntax calling ( or executing ) a function or method is called', 1, N'JVSCR', N'Primary expression', N' Functional expression', N'Invocation expression', N'Property Access Expression', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1079, N' What kind of an expression is “new Point(2,3)”?', 1, N'JVSCR', N' Primary Expression', N' Object Creation Expression', N' Invocation Expression', N'Constructor Calling Expression', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1080, N'Which of the operator is used to test if a particular property exists or not?', 1, N'JVSCR', N' in', N'exist', N'within', N'exists', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1081, N' Among the following, which one is a ternary operator?', 2, N'JVSCR', N'+', N' :', N'–', N' ?:', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1082, N'“An expression that can legally appear on the left side of an assignment expression.” is a well known explanation for variables, properties of objects, and elements of arrays. They are called', 2, N'JVSCR', N'Properties', N'Prototypes', N'Lvalue', N'Definition', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1083, N'JavaScript is a _______________ language', 2, N'JVSCR', N'Object-Oriented', N' High-level', N'Assembly-language', N'Object-Based', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1084, N'A conditional expression is also called a', 2, N'JVSCR', N' Alternate to if-else', N' Immediate if', N'If-then-else statement', N'None of the above', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1085, N'A statement block is a', 2, N'JVSCR', N'conditional block', N'block that contains a single statement', N' Both a and b', N'block that combines multiple statements into a single compound statement', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1086, N'When an empty statement is encountered, a JavaScript interpreter', 2, N'JVSCR', N'Ignores the statement', N'Prompts to complete the statement', N'Throws an error', N'Throws an exception', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1087, N'The “var” and “function” are', 2, N'JVSCR', N' Keywords', N' Declaration statements', N' Datatypes', N'Prototypes', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1088, N'The enumeration order becomes implementation dependent and non-interoperable if :', 2, N'JVSCR', N'If the object inherits enumerable properties', N'The object does not have the properties present in the integer array indices', N'The delete keyword is never used', N' Object.defineProperty() is not used', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1089, N'One of the special feature of an interpreter in reference with the for loop is that', 2, N'JVSCR', N'Before each iteration, the interpreter evaluates the variable expression and assigns the name of the property', N'The iterations can be infinite when an interpreter is used', N'The body of the loop is executed only once', N'All of the mentioned', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1090, N'What will happen if the body of a for/in loop deletes a property that has not yet been enumerated?', 2, N'JVSCR', N'The property will be stored in a cache', N'The loop will not run', N'That property will not be enumerated', N' All of the mentioned', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1091, N' What will be the step of the interpreter in a jump statement when an exception is thrown?', 2, N'JVSCR', N'The interpreter stops its work', N'The interpreter throws another exception', N'The interpreter jumps to the nearest enclosing exception handler', N' None of the mentioned', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1092, N'Among the keywords below, which one is not a statement?', 2, N'JVSCR', N'debugger', N'with', N'if', N'use strict', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1093, N'The pop() method of the array does which of the following task ?', 2, N'JVSCR', N'decrements the total length by 1', N'increments the total length by 1', N'prints the first element but no effect on the length', N'None of the above', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1094, N'The primary purpose of the array map() function is that it', 2, N'JVSCR', N'maps the elements of another array into itself', N'passes each element of the array and returns the necessary mapped elements', N'passes each element of the array on which it is invoked to the function you specify, and returns an array containing the values returned by that function.', N'None of the mentioned', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1095, N'The reduce and reduceRight methods follow a common operation called', 2, N'JVSCR', N'filter and fold', N'inject and fold', N'finger and fold', N'fold', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1096, N'The method or operator used to identify the array is', 2, N'JVSCR', N'isarrayType()', N'==', N'===', N'typeof', N'D', 2, 1)
GO
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1097, N'Which are the forms of client-side storage?', 2, N'JVSCR', N'Web Databases', N'FileSystem API', N' Offline Web Applications', N'All of the mentioned', N'D', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1098, N' Which is the storage that allows the caching of web pages and their associated resources?', 3, N'JVSCR', N' Web Databases', N'FileSystem API', N'Offline Web Applications', N'All of the mentioned', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1099, N'Which is the Microsoft’s own proprietary client-side storage?', 3, N'JVSCR', N'IE User Data', N'Offline Web Applications', N' Cookies', N'All of the mentioned', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1100, N' Which object supports Filesystem API?', 3, N'JVSCR', N'Element', N'File', N'Window', N'DOM', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1101, N'Which is the most appropriate database for developers requiring huge amount of data?', 3, N'JVSCR', N'Database', N'Datawarehouse', N'Web databases', N'Access', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1102, N'The localStorage and sessionStorage belongs to', 3, N'JVSCR', N'Window object', N'Element object', N'Hash object', N'DOM objec', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1103, N'What is the main difference between localStorage and sessionStorage?', 3, N'JVSCR', N'Lifetime', N'Scope', N'Both a and b', N'None of the mentioned', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1104, N' What is the lifetime of the data stored through localStorage?', 3, N'JVSCR', N'Permanant', N'Temporary', N'Both a and b at times', N'Cannot store', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1105, N'. Which is the function used to retrieve a value?', 3, N'JVSCR', N'get()', N'etrieve()', N' getItem()', N'retrieveItem()', N'C', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1106, N'Which is the function used to store a value?', 3, N'JVSCR', N'setItem()', N'set()', N'storeItem()', N'store()', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1107, N'How many node types are there in total?', 3, N'JVSCR', N'11', N'12', N'13', N'14', N'B', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1108, N' What is the purpose of the Node object property ownerDocument?', 3, N'JVSCR', N'Returns the root element', N' Returns the last element', N' Returns the parent node', N' Returns the immediate node', N'A', 2, 1)
INSERT [dbo].[CauHoi] ([macauhoi], [ndcauhoi], [dokho], [mamonhoc], [phuonganA], [phuonganB], [phuonganC], [phuonganD], [dapan], [matk], [trangthai]) VALUES (1109, N'Which of the following Node object property returns the local part of the name of a node?', 3, N'JVSCR', N'lastName', N'localName', N'firstName', N'None of the mentioned', N'B', 2, 1)
SET IDENTITY_INSERT [dbo].[CauHoi] OFF
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (1, 1)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (1, 2)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (2, 1)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (2, 2)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (3, 1)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (4, 1)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (1002, 2)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (1003, 2)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (1004, 2)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (1005, 1)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (1006, 1)
INSERT [dbo].[CTDeThi] ([macauhoi], [madethi]) VALUES (1007, 1)
SET IDENTITY_INSERT [dbo].[DeThi] ON 

INSERT [dbo].[DeThi] ([madethi], [mamonhoc], [socaudokho1], [socaudokho2], [socaudokho3], [trangthai], [dsmacauhoi], [time], [tongdiem], [dsradom], [thoigianthi]) VALUES (1, N'T', 1, 2, 1, 1, N'1002;1003;1004;1005;1006;1007', CAST(0x0700BCA065010000 AS Time), CAST(10 AS Decimal(10, 0)), N'1002;1003;1004;1005;1006;1007', 10)
INSERT [dbo].[DeThi] ([madethi], [mamonhoc], [socaudokho1], [socaudokho2], [socaudokho3], [trangthai], [dsmacauhoi], [time], [tongdiem], [dsradom], [thoigianthi]) VALUES (2, N'T', 2, 1, 2, 1, N'1002;1003;1004;1005;1006;1007', CAST(0x0700BCA065010000 AS Time), CAST(10 AS Decimal(10, 0)), N'1;2;3;1002;1003;1004;1005;1006;1007', 10)
SET IDENTITY_INSERT [dbo].[DeThi] OFF
SET IDENTITY_INSERT [dbo].[KetQua] ON 

INSERT [dbo].[KetQua] ([makq], [tongdiem], [matk], [madethi], [ngaythi]) VALUES (12, 1, 16, 1, CAST(0x0000A81500000000 AS DateTime))
INSERT [dbo].[KetQua] ([makq], [tongdiem], [matk], [madethi], [ngaythi]) VALUES (13, 1, 3, 1, CAST(0x0000A81600000000 AS DateTime))
INSERT [dbo].[KetQua] ([makq], [tongdiem], [matk], [madethi], [ngaythi]) VALUES (14, 1, 3, 2, CAST(0x0000A81700000000 AS DateTime))
INSERT [dbo].[KetQua] ([makq], [tongdiem], [matk], [madethi], [ngaythi]) VALUES (15, 1, 3, 2, CAST(0x0000A81700000000 AS DateTime))
INSERT [dbo].[KetQua] ([makq], [tongdiem], [matk], [madethi], [ngaythi]) VALUES (16, 2, 3, 2, CAST(0x0000A81A00000000 AS DateTime))
SET IDENTITY_INSERT [dbo].[KetQua] OFF
INSERT [dbo].[LopHoc] ([malophoc], [tenlop], [trangthai]) VALUES (N'ACCP1603', N'APEX JAVA', 1)
INSERT [dbo].[LopHoc] ([malophoc], [tenlop], [trangthai]) VALUES (N'ACCP1609', N'APEX JAVA', 1)
INSERT [dbo].[MonHoc] ([mamonhoc], [tenmonhoc], [sotinchi], [trangthai]) VALUES (N'ANDRD', N'Androind', 2, 1)
INSERT [dbo].[MonHoc] ([mamonhoc], [tenmonhoc], [sotinchi], [trangthai]) VALUES (N'JVI', N'JAVA I', 5, 1)
INSERT [dbo].[MonHoc] ([mamonhoc], [tenmonhoc], [sotinchi], [trangthai]) VALUES (N'JVSCR', N'JavaScript', 3, 1)
INSERT [dbo].[MonHoc] ([mamonhoc], [tenmonhoc], [sotinchi], [trangthai]) VALUES (N'PHP', N'PHP', 3, 1)
INSERT [dbo].[MonHoc] ([mamonhoc], [tenmonhoc], [sotinchi], [trangthai]) VALUES (N'T', N'Toán', 3, 1)
SET IDENTITY_INSERT [dbo].[TaiKhoan] ON 

INSERT [dbo].[TaiKhoan] ([matk], [hoten], [ngaysinh], [diachi], [namhoc], [sdt], [email], [username], [pass], [malophoc], [quyen], [trangthai]) VALUES (1, N'Nguyến Sơn A', CAST(0x00007F8100000000 AS DateTime), N'TP.HCM', 2017, N'0977240473', N'son@gmail', N'admin', N'e10adc3949ba59abbe56', N'ACCP1603', N'admin     ', 1)
INSERT [dbo].[TaiKhoan] ([matk], [hoten], [ngaysinh], [diachi], [namhoc], [sdt], [email], [username], [pass], [malophoc], [quyen], [trangthai]) VALUES (2, N'Lê Đình Tuấn', CAST(0x0000A41300000000 AS DateTime), N'TP.HCM', 2017, N'0977240474', N'tuan@gmail', N'teacher', N'e10adc3949ba59abbe56', N'ACCP1603', N'teacher   ', 1)
INSERT [dbo].[TaiKhoan] ([matk], [hoten], [ngaysinh], [diachi], [namhoc], [sdt], [email], [username], [pass], [malophoc], [quyen], [trangthai]) VALUES (3, N'Lê Hữu Tùng', CAST(0x0000A58F00000000 AS DateTime), N'TP.HCM', 2017, N'0977240475', N'tung@gmail', N'student', N'e10adc3949ba59abbe56', N'ACCP1603', N'student   ', 1)
INSERT [dbo].[TaiKhoan] ([matk], [hoten], [ngaysinh], [diachi], [namhoc], [sdt], [email], [username], [pass], [malophoc], [quyen], [trangthai]) VALUES (16, N'Nguyễn Sơn B', CAST(0x0000A7AA00000000 AS DateTime), N'TP.CamRanh', 2017, N'0977240473', N'nguyen@gmail', N'son2', N'e10adc3949ba59abbe56', N'ACCP1603', N'student   ', 1)
INSERT [dbo].[TaiKhoan] ([matk], [hoten], [ngaysinh], [diachi], [namhoc], [sdt], [email], [username], [pass], [malophoc], [quyen], [trangthai]) VALUES (31, N'Le Tung', CAST(0x0000A80300000000 AS DateTime), N'Ha Noi', 2015, N'012345678', N'letung@gmail.com', N'letung', N'e10adc3949ba59abbe56', N'ACCP1603', N'admin     ', 1)
INSERT [dbo].[TaiKhoan] ([matk], [hoten], [ngaysinh], [diachi], [namhoc], [sdt], [email], [username], [pass], [malophoc], [quyen], [trangthai]) VALUES (32, N'tung le', CAST(0x0000A80B00000000 AS DateTime), N'tphcm', 2015, N'012345652', N'dsjnn@gam.com', N'tung2', N'e10adc3949ba59abbe56', N'ACCP1603', N'admin     ', 1)
INSERT [dbo].[TaiKhoan] ([matk], [hoten], [ngaysinh], [diachi], [namhoc], [sdt], [email], [username], [pass], [malophoc], [quyen], [trangthai]) VALUES (33, N'f', CAST(0x0000A80400000000 AS DateTime), N'sf', 2012, N'1234560', N'tung@gmail.com', N'tung123', N'e10adc3949ba59abbe56', N'ACCP1603', N'admin     ', 1)
INSERT [dbo].[TaiKhoan] ([matk], [hoten], [ngaysinh], [diachi], [namhoc], [sdt], [email], [username], [pass], [malophoc], [quyen], [trangthai]) VALUES (34, N'admin2', NULL, N'adafasf', 2014, N'0125456585', N'adasfafa@gmail.com', N'admin2', N'e10adc3949ba59abbe56', N'ACCP1603', N'admin     ', 1)
SET IDENTITY_INSERT [dbo].[TaiKhoan] OFF
ALTER TABLE [dbo].[CauHoi] ADD  CONSTRAINT [DF_CauHoi_trangthai]  DEFAULT ((1)) FOR [trangthai]
GO
ALTER TABLE [dbo].[DeThi] ADD  CONSTRAINT [DF_DeThi_trangthai]  DEFAULT ((1)) FOR [trangthai]
GO
ALTER TABLE [dbo].[LopHoc] ADD  CONSTRAINT [DF_LopHoc_trangthai]  DEFAULT ((1)) FOR [trangthai]
GO
ALTER TABLE [dbo].[MonHoc] ADD  CONSTRAINT [DF_MonHoc_trangthai]  DEFAULT ((1)) FOR [trangthai]
GO
ALTER TABLE [dbo].[TaiKhoan] ADD  CONSTRAINT [DF_TaiKhoan_pass]  DEFAULT (N'123456') FOR [pass]
GO
ALTER TABLE [dbo].[TaiKhoan] ADD  CONSTRAINT [DF_TaiKhoan_trangthai]  DEFAULT ((1)) FOR [trangthai]
GO
ALTER TABLE [dbo].[CauHoi]  WITH CHECK ADD  CONSTRAINT [FK_CauHoi_MonHoc] FOREIGN KEY([mamonhoc])
REFERENCES [dbo].[MonHoc] ([mamonhoc])
GO
ALTER TABLE [dbo].[CauHoi] CHECK CONSTRAINT [FK_CauHoi_MonHoc]
GO
ALTER TABLE [dbo].[CauHoi]  WITH CHECK ADD  CONSTRAINT [FK_CauHoi_TaiKhoan] FOREIGN KEY([matk])
REFERENCES [dbo].[TaiKhoan] ([matk])
GO
ALTER TABLE [dbo].[CauHoi] CHECK CONSTRAINT [FK_CauHoi_TaiKhoan]
GO
ALTER TABLE [dbo].[CTDeThi]  WITH CHECK ADD  CONSTRAINT [FK_CTDeThi_CauHoi] FOREIGN KEY([macauhoi])
REFERENCES [dbo].[CauHoi] ([macauhoi])
GO
ALTER TABLE [dbo].[CTDeThi] CHECK CONSTRAINT [FK_CTDeThi_CauHoi]
GO
ALTER TABLE [dbo].[CTDeThi]  WITH CHECK ADD  CONSTRAINT [FK_CTDeThi_DeThi] FOREIGN KEY([madethi])
REFERENCES [dbo].[DeThi] ([madethi])
GO
ALTER TABLE [dbo].[CTDeThi] CHECK CONSTRAINT [FK_CTDeThi_DeThi]
GO
ALTER TABLE [dbo].[KetQua]  WITH CHECK ADD  CONSTRAINT [FK_KetQua_DeThi] FOREIGN KEY([madethi])
REFERENCES [dbo].[DeThi] ([madethi])
GO
ALTER TABLE [dbo].[KetQua] CHECK CONSTRAINT [FK_KetQua_DeThi]
GO
ALTER TABLE [dbo].[KetQua]  WITH CHECK ADD  CONSTRAINT [FK_KetQua_TaiKhoan] FOREIGN KEY([matk])
REFERENCES [dbo].[TaiKhoan] ([matk])
GO
ALTER TABLE [dbo].[KetQua] CHECK CONSTRAINT [FK_KetQua_TaiKhoan]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_LopHoc] FOREIGN KEY([malophoc])
REFERENCES [dbo].[LopHoc] ([malophoc])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_LopHoc]
GO
ALTER TABLE [dbo].[Thamgia]  WITH CHECK ADD  CONSTRAINT [FK_Thamgia_MonHoc] FOREIGN KEY([mamonhoc])
REFERENCES [dbo].[MonHoc] ([mamonhoc])
GO
ALTER TABLE [dbo].[Thamgia] CHECK CONSTRAINT [FK_Thamgia_MonHoc]
GO
ALTER TABLE [dbo].[Thamgia]  WITH CHECK ADD  CONSTRAINT [FK_Thamgia_TaiKhoan] FOREIGN KEY([matk])
REFERENCES [dbo].[TaiKhoan] ([matk])
GO
ALTER TABLE [dbo].[Thamgia] CHECK CONSTRAINT [FK_Thamgia_TaiKhoan]
GO
USE [master]
GO
ALTER DATABASE [QLTTNSON] SET  READ_WRITE 
GO
